# Modal component

## Modal design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `MaterialAlertDialogBuilder` class or the `VitaminModalBuilder` class.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

### Standard modal

```kotlin
VitaminModalBuilder(context)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```

or

```kotlin
MaterialAlertDialogBuilder(context)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```

### Centered modal

```kotlin
VitaminModalBuilderCentered(context)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```

or

```kotlin
MaterialAlertDialogBuilder(context, R.style.ThemeOverlay_Vitamin_Modal_Centered)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```kotlin
val vitaminContext = ContextThemeWrapper(context, R.style.Theme_Vitamin_<ThemeName>)

VitaminModalBuilder(context, R.style.ThemeOverlay_Vitamin_Modal)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```
