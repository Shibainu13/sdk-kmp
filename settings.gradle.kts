pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
//        maven {
//            name = "GithubPackages"
//            url = uri("https://maven.pkg.github.com/Shibainu13/sdk-kmp")
//            credentials {
//                username = providers.gradleProperty("gpr.user").getOrElse("")
//                password = providers.gradleProperty("gpr.key").getOrElse("")
//            }
//        }

        mavenLocal()
        google()
        mavenCentral()
        maven("https://jitpack.io")

        maven {
            url = uri("https://maven.pkg.jetbrains.space/public/p/kotlinx-coroutines/maven")
            content {
                includeGroupByRegex("org\\.jetbrains.*")
                includeGroupByRegex("kotlinx.*")
            }
        }

        maven {
            url = uri("https://maven.pkg.github.com/LF-Decentralized-Trust-labs/aries-uniffi-wrappers")
            credentials {
                username = providers.gradleProperty("gpr.user").getOrElse("")
                password = providers.gradleProperty("gpr.key").getOrElse("")
            }
        }
    }
}

rootProject.name = "sdk-kmp" // we can rename later if you want

include(":protosLib")
include(":sdk")
include(":sampleapp")
