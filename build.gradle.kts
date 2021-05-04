plugins {
    java
    kotlin("jvm") version "1.4.30"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
    }
    maven {
        url = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
    }
}

dependencies {
    implementation("ca.uhn.hapi.fhir", "org.hl7.fhir.r5", "5.2.19")
    implementation("ca.uhn.hapi.fhir", "org.hl7.fhir.utilities", "5.2.19")
    implementation("com.google.code.gson", "gson", "2.8.6")
    implementation("org.apache.commons", "commons-compress", "1.20")
    implementation("org.ogce", "xpp3", "1.1.6")


    testImplementation("junit", "junit", "4.12")
    testImplementation("ca.uhn.hapi.fhir", "org.hl7.fhir.r5", "5.2.19")
    testImplementation("ca.uhn.hapi.fhir", "org.hl7.fhir.utilities", "5.2.19")
    testImplementation("com.google.code.gson", "gson", "2.8.6")
    testImplementation("org.apache.commons", "commons-compress", "1.20")
    testImplementation("org.ogce", "xpp3", "1.1.6")

}
