# SpaceTradersKMP

SpaceTradersKMP is an API wrapper for SpaceTraders game in Kotlin Multiplatform.

## Preface

This library is mainly intended to be used for Kotlin Multiplatform.

## Build Compatibility

### JVM

> [!note]
> JVM Toolchain Version: 17

## Usage

> [!tip]
> Check [latest](https://repo1.maven.org/maven2/com/github/yamin8000/SpaceTradersKMP/maven-metadata.xml) version from
> Maven Repository or [here](https://central.sonatype.com/artifact/com.github.yamin8000/SpaceTradersKMP).

### Install

#### Kotlin Multiplatform

##### Gradle Kotlin DSL

```kotlin
implementation("com.github.yamin8000:SpaceTradersKMP:version")
```

#### JVM

##### Gradle Groovy DSL

```groovy
implementation group: 'com.github.yamin8000', name: 'SpaceTradersKMP-jvm', version: 'version'
```

##### Gradle Kotlin DSL

```kotlin
implementation("com.github.yamin8000:SpaceTradersKMP-jvm:version")
```

##### Maven

```xml

<dependency>
    <groupId>com.github.yamin8000</groupId>
    <artifactId>SpaceTradersKMP</artifactId>
    <version>version</version>
</dependency>

```

### Sample code

#### Client initialization

```kotlin
    val client = GameClient(token = "")
```

#### Register

```kotlin
    val request = RegisterRequest(
        faction = FactionSymbol.COSMIC,
        symbol = "yamin",
        email = "yamin@yahoo.com"
    )
    val response = client.register(request)
    println(response.data)
```

## Features

## License

> [!important]
> This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
> License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
> version.
> This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
> warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
> You should have received a copy of the GNU General Public License along with this program. If not,
> see <https://www.gnu.org/licenses/>. 
