import org.jetbrains.kotlin.gradle.plugin.KotlinTargetsContainerWithPresets;
plugins {
    kotlin("multiplatform") version "1.3.31"
}

repositories {
    mavenCentral()
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                dependencies {
                    api(kotlin("stdlib-jdk8"))
                }
            }
        }
    }
    linuxX64("linux") {
        binaries {
            executable()
            // staticLib()
        }
    }
    mingwX64("windows") {
        binaries {
            executable()
        }
    }
}


tasks.withType<Wrapper> {
    gradleVersion = "5.3.1"
    distributionType = Wrapper.DistributionType.ALL
}


