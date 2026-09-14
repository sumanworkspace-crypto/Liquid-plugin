plugins {
    `java-gradle-plugin`
    `maven-publish`
}

group = "com.liquid.ide.tooling"
version = "1.0.0-beta"

repositories {
    mavenCentral()
}

dependencies {
    // Gradle API is provided by the gradle runtime
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

gradlePlugin {
    plugins {
        create("liquidToolingPlugin") {
            id = "com.liquid.ide.tooling"
            implementationClass = "com.liquid.ide.tooling.LiquidToolingPlugin"
        }
    }
}

publishing {
    repositories {
        maven {
            name = "GitHubPages"
            url = uri("${rootDir}/maven")
        }
    }
}
