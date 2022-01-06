# Snackbar component

## Snackbar design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default 
`snackbar` component from material component library.

> **Note:** Vitamin doesn't provide a kotlin class for this components because we can't extend the material class.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```kotlin
// Snackbar with message only
Snackbar.make(view, 
              "This is the description of the snackbar.", 
              Snackbar.LENGTH_LONG)
    .show()

// Snackbar with action button
Snackbar.make(view, "This is the description of the snackbar.",
              Snackbar.LENGTH_LONG)
              .setAction("Action") {
                  // TODO : add your action here
              }
	.show()
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) 
on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and 
link the Vitamin progress indicator styles. You can now use the snackbar component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:snackbars:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="snackbarStyle">@style/Widget.Vitamin.Snackbar</item>
        <item name="snackbarButtonStyle">@style/Widget.Vitamin.SnackbarButton</item>
        <item name="snackbarTextViewStyle">@style/Widget.Vitamin.Snackbar.TextView</item>
        <item name="maxActionInlineWidth">@dimen/vtmnMaxActionInlineWidth</item>
    </style>
</resources>
```

```kotlin
// Snackbar with message only
Snackbar.make(view, 
              "This is the description of the snackbar.", 
              Snackbar.LENGTH_LONG)
    .show()

// Snackbar with action button
Snackbar.make(view, "This is the description of the snackbar.",
              Snackbar.LENGTH_LONG)
              .setAction("Action") {
                  // TODO : add your action here
              }
	.show()
```

### Version 2

If you don't want to use Vitamin colors and font on all your app, 
you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:id="@id/constraint_layout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin">

    

</androidx.constraintlayout.widget.ConstraintLayout>
```

```kotlin
val constraintLayout = findViewById(R.id.constraint_layout)

// Snackbar with message only
Snackbar.make(constraintLayout, 
              "This is the description of the snackbar.", 
              Snackbar.LENGTH_LONG)
    .show()

// Snackbar with action button
Snackbar.make(constraintLayout, "This is the description of the snackbar.",
              Snackbar.LENGTH_LONG)
              .setAction("Action") {
                  // TODO : add your action here
              }
	.show()
```

