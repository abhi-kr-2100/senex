plugins {
    id("java")
}

group = "io.abhikr2100"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")

    testImplementation("org.mockito:mockito-inline:4.8.0")
    testImplementation("org.mockito:mockito-junit-jupiter:4.8.0")

    implementation("org.jsoup:jsoup:1.15.3")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}