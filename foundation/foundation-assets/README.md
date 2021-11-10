# Assets module

## Responsibilities

Import all assets as a vector to be used by Vitamin Android and Vitamin Compose.

## How to use it?

Excepted for Vitamin Android or Compose, we don't recommend you to use this module
directly. If you want to use the smallest artifact with atomic elements of Vitamin,
please consider to use [foundation](../foundation/README.md) artifact instead of this one.

But if you really want to use this artifact, you just need to declare the Gradle
dependency below and get assets from identifiers.

````kotlin
implementation("com.decathlon.vitamin:foundation-assets:<version>")
```` 
