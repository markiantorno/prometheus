import org.hl7.fhir.exceptions.FHIRException
import org.hl7.fhir.r5.model.Base
import org.hl7.fhir.r5.model.EnumFactory
import org.hl7.fhir.r5.model.Enumeration
import org.hl7.fhir.r5.model.PrimitiveType

class Enumerations {
    enum class ActionCardinalityBehavior {
        /**
         * The action may only be selected one time.
         */
        SINGLE,

        /**
         * The action may be selected multiple times.
         */
        MULTIPLE,

        /**
         * added to help the parsers
         */
        NULL;

        fun toCode(): String? {
            return when (this) {
                SINGLE -> "single"
                MULTIPLE -> "multiple"
                NULL -> null
            }
        }

        val system: String?
            get() = when (this) {
                SINGLE -> "http://hl7.org/fhir/action-cardinality-behavior"
                MULTIPLE -> "http://hl7.org/fhir/action-cardinality-behavior"
                NULL -> null
            }
        val definition: String?
            get() = when (this) {
                SINGLE -> "The action may only be selected one time."
                MULTIPLE -> "The action may be selected multiple times."
                NULL -> null
            }
        val display: String?
            get() = when (this) {
                SINGLE -> "Single"
                MULTIPLE -> "Multiple"
                NULL -> null
            }

        companion object {
            @Throws(FHIRException::class)
            fun fromCode(codeString: String?): ActionCardinalityBehavior? {
                if (codeString == null || "" == codeString) return null
                if ("single" == codeString) return SINGLE
                if ("multiple" == codeString) return MULTIPLE
                throw FHIRException("Unknown ActionCardinalityBehavior code '$codeString'")
            }
        }
    }

    class ActionCardinalityBehaviorEnumFactory : EnumFactory<ActionCardinalityBehavior> {
        @Throws(IllegalArgumentException::class)
        override fun fromCode(codeString: String?): ActionCardinalityBehavior? {
            if (codeString == null || "" == codeString) return null
            if ("single" == codeString) return ActionCardinalityBehavior.SINGLE
            if ("multiple" == codeString) return ActionCardinalityBehavior.MULTIPLE
            throw IllegalArgumentException("Unknown ActionCardinalityBehavior code '$codeString'")
        }

        @Throws(FHIRException::class)
        fun fromType(code: Base?): Enumeration<ActionCardinalityBehavior>? {
            if (code == null) return null
            if (code.isEmpty) return Enumeration(this)
            val codeString = (code as PrimitiveType<*>).asStringValue()
            if (codeString == null || "" == codeString) return null
            if ("single" == codeString) return Enumeration(this, ActionCardinalityBehavior.SINGLE)
            if ("multiple" == codeString) return Enumeration(this, ActionCardinalityBehavior.MULTIPLE)
            throw FHIRException("Unknown ActionCardinalityBehavior code '$codeString'")
        }

        override fun toCode(code: ActionCardinalityBehavior): String? {
            return when (code) {
                ActionCardinalityBehavior.SINGLE -> "single"
                ActionCardinalityBehavior.MULTIPLE -> "multiple"
                ActionCardinalityBehavior.NULL -> null
            }
        }

        override fun toSystem(code: ActionCardinalityBehavior): String? {
            return code.system
        }
    }
}