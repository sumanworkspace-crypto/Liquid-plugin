# Liquid Tooling Plugin

A Gradle plugin providing tooling and utilities for Liquid IDE projects.

**Maven Coordinates:**
```
com.liquid.ide.tooling:plugin:1.0.0
```

**Plugin ID:**
```
com.liquid.ide.tooling
```

## Installation

### Using Plugin DSL (Recommended)

Add to your `settings.gradle.kts`:

```kotlin
pluginManagement {
    repositories {
        maven {
            url = uri("https://raw.githubusercontent.com/sumanworkspace-crypto/Liquid-plugin/main/maven")
        }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
```

Add to your `build.gradle.kts`:

```kotlin
plugins {
    id("com.liquid.ide.tooling") version "1.0.0"
}
```

### Using buildscript/classpath

Add to your `build.gradle.kts`:

```kotlin
buildscript {
    repositories {
        maven {
            url = uri("https://raw.githubusercontent.com/sumanworkspace-crypto/Liquid-plugin/main/maven")
        }
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.liquid.ide.tooling:plugin:1.0.0")
    }
}

apply(plugin = "com.liquid.ide.tooling")
```

## Usage

Once applied, the plugin registers the `liquidIdeInfo` task:

```bash
./gradlew liquidIdeInfo
```

Output:
```
========================================
Liquid Tooling Plugin
Version: 1.0.0
Project: my-project
========================================
```

## Troubleshooting

### "Could not find any matches for com.liquid.ide.tooling:plugin:1.0.0"

Ensure your repository configuration includes the Maven repository URL:

```kotlin
repositories {
    maven {
        url = uri("https://raw.githubusercontent.com/sumanworkspace-crypto/Liquid-plugin/main/maven")
    }
}
```

The plugin is published to a GitHub-hosted Maven repository and is not available on Maven Central or Gradle Plugin Portal.

## Development

To build locally:

```bash
./gradlew clean build
```

To publish artifacts to the local `maven/` directory:

```bash
./gradlew publishAllPublicationsToGitHubPagesRepository
```

## License

See LICENSE file for details.
