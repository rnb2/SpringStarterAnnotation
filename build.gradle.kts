plugins {
    id("java")
}

group = "com.rnb"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.springframework/spring-core
    implementation("org.springframework:spring-core:6.2.5")

    // https://mvnrepository.com/artifact/org.springframework/spring-context
    implementation("org.springframework:spring-context:6.2.5")

    // https://mvnrepository.com/artifact/jakarta.annotation/jakarta.annotation-api
    implementation("jakarta.annotation:jakarta.annotation-api:3.0.0")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testCompileOnly("org.projectlombok:lombok:1.18.36")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.36")

    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")
}

tasks.test {
    useJUnitPlatform()
}