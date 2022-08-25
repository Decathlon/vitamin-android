# Foundation module

## Responsabilities

This module is used by all Vitamin component artifacts to apply the correct design
specification and contain atomic components of the Decathlon Design System with:

* Vitamix icons
* Vitamin text styles
* Vitamin semantic colors
* Vitamin theme with dark and light mode

These resources are public and can be imported as a standalone artifact in an external 
application.

## How to use it?

If you want to use this module because you are only interested by Vitamin colors, 
texts or icons, you can import this dependency in your `build.gradle` file of your
Android project:

````kotlin
implementation("com.decathlon.vitamin:foundation:<version>")
```` 

If you want to use the theme defined in this module, you need to know that only atomic 
components are mapped in the base theme. It is your responsibility to make all component 
bindings in your custom theme.

```xml
<style name="Your.AppTheme" parent="Base.Theme.Vitamin.Foundation.Light">
    <!-- Components mapping here... -->
</style>
```

```xml
<style name="Your.AppTheme" parent="Base.Theme.Vitamin.Foundation.Dark">
    <!-- Components mapping here... -->
</style>
```

But think about the usage of the [vitamin artifact](https://github.com/Decathlon/vitamin-android/tree/main/vitamin) 
to have all components with the design specification described on [www.decathlon.design](https://www.decathlon.design) 
website.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="Your.AppTheme" parent="Theme.Vitamin.<ThemeName>">
    <!-- Components mapping here... -->
</style>
```