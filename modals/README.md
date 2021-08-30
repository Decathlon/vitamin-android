# Modal component

## Modal design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `MaterialAlertDialogBuilder` class or the `VitaminModalBuilder` class. 

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
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

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin modal style.
You can now use the modal builder class as seen previously.

```kotlin
implementation("com.decathlon.vitamin:modals:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="materialAlertDialogTheme">@style/ThemeOverlay.Vitamin.Modal</item>
    </style>
</resources>
```

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

### Version 2

If you don't want to override all the modals or your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:modals:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```kotlin
MaterialAlertDialogBuilder(context, R.style.ThemeOverlay_Vitamin_Modal)
    .setTitle("Title")
    .setMessage("Message")
    .setNegativeButton("Decline", null)
    .setPositiveButton("Accept", null)
    .show()
```
