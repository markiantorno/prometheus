package org.hl7.fhir.r5.model

// generated

{{license}}

{{startMark}}

object Constants {
    const val LOCAL_REF_REGEX = "({{rt}})\\\\/[A-Za-z0-9\\\\-\\\\.]{1,64}"
    const val NS_SYSTEM_TYPE = "http://hl7.org/fhirpath/System."

    const val VERSION = "{{version}}"
    const val VERSION_MM = "{{version-mm}}"
    const val DATE = "{{date}}"
    const val URI_REGEX = "((http|https)://([A-Za-z0-9\\\\\\.\\:\\%\\$]*\\/)*)?({{rt}})\\/[A-Za-z0-9\\-\\.]{1,64}(\\/_history\\/[A-Za-z0-9\\-\\.]{1,64})?"
}