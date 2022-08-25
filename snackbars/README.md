# Snackbar component

## Snackbar design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default 
`snackbar` component from material component library.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

> **Note:** Vitamin doesn't provide a kotlin class for this components because we can't extend the material class.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
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

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:id="@id/constraint_layout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    

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

