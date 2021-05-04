package org.hl7.fhir.core.generator.codegen;

import org.hl7.fhir.core.generator.engine.Definitions;
import org.hl7.fhir.r5.model.ValueSet;
import org.hl7.fhir.r5.model.ValueSet.ValueSetExpansionContainsComponent;
import org.hl7.fhir.utilities.CommaSeparatedStringBuilder;
import org.hl7.fhir.utilities.Utilities;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

/*
Copyright (c) 2011+, HL7, Inc
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.
 * Neither the name of HL7 nor the names of its contributors may be used to
   endorse or promote products derived from this software without specific
   prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.

*/

/*
changes for James
- lazy construction of lists
- getX will construct if null
- add hasX

*/
public class JavaEnumerationsGenerator extends JavaBaseGenerator {

    public JavaEnumerationsGenerator(OutputStream out, Definitions definitions, Configuration configuration, Date genDate, String version) throws UnsupportedEncodingException {
        super(out, definitions, configuration, version, genDate);
    }

    public void generate() throws Exception {
        write("package org.hl7.fhir.r5.model\r\n");
        startMark(version, genDate);
        write("\r\n");
        write("import org.hl7.fhir.instance.model.api.*\r\n");
        write("import org.hl7.fhir.exceptions.FHIRException\r\n");
        write("\r\n");

        write("class Enumerations {\r\n");
        write("\r\n");
        write("// In here: \r\n");

        Map<String, ValueSet> enums = scanForEnums();
        List<String> names = new ArrayList<String>();
        names.addAll(enums.keySet());
        Collections.sort(names);
        for (String n : names) {
            ValueSet vs = enums.get(n);
            write("//   " + n + ": " + vs.getDescription());
            if (vs.hasUserData("usages")) {
                write(vs.getUserData("usages").toString());
            } else {
                write("?null?");
            }
            write("\r\n");
        }
        write("\r\n");
        write("\r\n");
        // End of Enum list

        for (String n : names) {
            ValueSet vs = enums.get(n);
            generateEnum(n, (ValueSet) vs.getUserData("expansion"));
        }
        write("\r\n");
        write("}\r\n");
        write("\r\n");
        flush();
    }

    private Map<String, ValueSet> scanForEnums() {
        Map<String, ValueSet> res = new HashMap<>();
        for (ValueSet vs : definitions.getValuesets().getSortedList()) {
            if (vs.hasUserData("shared") && vs.hasUserData("expansion")) {
                res.put(getCodeListType(vs.getName()), vs);
            }
        }
        return res;
    }


    private void generateEnum(String name, ValueSet vs) throws Exception {
        String url = vs.getUrl();
        write("\tenum class " + name + " {\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t/**\r\n");
            write("\t\t* " + definitions.getCodeDefinition(c.getSystem(), c.getCode()) + "\r\n");
            write("\t\t*/\r\n");
            write("\t\t" + cc.toUpperCase() + ", \r\n");
        }
        write("\t\t/**\r\n");
        write("\t\t* added to help the parsers\r\n");
        write("\t\t*/\r\n");
        write("\t\tNULL;\r\n");

        write("\t\tfun toCode() {\r\n");
        write("\t\t\treturn when (this) {\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t\t\t" + cc + " -> \"" + c.getCode() + "\"\r\n");
        }
        write("\t\t\t\tNULL -> null\r\n");
        write("\t\t\t}\r\n");
        write("\t\t}\r\n");

        write("\t\tval system: String?\r\n");
        write("\t\t\tget() = when (this) {\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t\t\t" + cc + " -> \"" + c.getSystem() + "\"\r\n");
        }
        write("\t\t\t\tNULL -> null\r\n");
        write("\t\t\t}\r\n");

        write("\t\tval definition: String?\r\n");
        write("\t\t\tget() = when (this) {\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t\t\t" + cc + " -> \"" + Utilities.escapeJava(definitions.getCodeDefinition(c.getSystem(), c.getCode())) + "\"\r\n");
        }
        write("\t\t\t\tNULL -> null\r\n");
        write("\t\t\t}\r\n");

        write("\t\tval display: String?\r\n");
        write("\t\t\tget() = when (this) {\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t\t\t" + cc + " -> \"" + Utilities.escapeJava(Utilities.noString(c.getDisplay()) ? c.getCode() : c.getDisplay()) + "\";\r\n");
        }
        write("\t\t\t\tNULL -> null\r\n");
        write("\t\t\t}\r\n");

        write("\t\tcompanion object {\r\n");
        write("\t\t\t@Throws(FHIRException::class)\r\n");
        write("\t\t\tfun fromCode(codeString: String?): " + name + "? {\r\n");
        write("\t\t\t\tif (codeString == null || \"\" == codeString) return null\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t\t\tif (\"" + c.getCode() + "\" == codeString) return " + cc + "\r\n");
        }
        write("\t\t\t\tthrow FHIRException(\"Unknown " + name + " code '\"$codeString\"'\")\r\n");
        write("\t\t\t}\r\n");
        write("\t\t}\r\n");

        if (config.getAdornments().containsKey(name)) {
            write("// manual code from configuration.txt:\r\n");
            write(config.getAdornments().get(name) + "\r\n");
            write("// end addition\r\n");
        }

        write("\t}\r\n");
        write("\r\n");

        write("\tclass " + name + "EnumFactory : EnumFactory<" + name + "> {\r\n");

        write("\t\t@Throws(IllegalArgumentException::class)\r\n");
        write("\t\toverride fun fromCode(codeString: String?): " + name + "? {\r\n");
        write("\t\t\tif (codeString == null || \"\" == codeString) return null\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t\tif (\"" + c.getCode() + "\" == codeString) return " + name + "." + cc + "\r\n");
        }
        write("\t\t\tthrow IllegalArgumentException(\"Unknown " + name + " code '$codeString'\")\r\n");
        write("\t\t}\r\n");

        write("\t\t@Throws(FHIRException::class)\r\n");
        write("\t\tfun fromType(code: Base?): Enumeration<" + name + ">? {\r\n");
        write("\t\t\tif (code == null) return null\r\n");
        write("\t\t\tif (code.isEmpty) return Enumeration(this)\r\n");
        write("\t\t\tval codeString = (code as PrimitiveType<*>).asStringValue()\r\n");
        write("\t\t\tif (codeString == null || \"\" == codeString) return null\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t\tif (\"" + c.getCode() + "\" == codeString) return new Enumeration(this, " + name + "." + cc + ")\r\n");
        }
        write("\t\t\tthrow FHIRException(\"Unknown " + name + " code '$codeString'\")\r\n");
        write("\t\t}\r\n");

        write("\t\toverride fun toCode(code: " + name + "): String? {\r\n");
        write("\t\t\treturn when (code) {\r\n");
        for (ValueSetExpansionContainsComponent c : vs.getExpansion().getContains()) {
            String cc = Utilities.camelCase(c.getCode());
            cc = makeConst(cc);
            write("\t\t\t\t" + name + "." + cc + " -> \"" + c.getCode() + "\"\r\n");
        }
        write("\t\t\t\tNULL -> null\r\n");
        write("\t\t\t}\r\n");
        write("\t\t}\r\n");

        write("\t\toverride fun toSystem(code: " + name + "): String? {\r\n");
        write("\t\t\treturn code.system\r\n");
        write("\t\t}\r\n");

        write("    }\r\n");
        write("\r\n");
    }
}