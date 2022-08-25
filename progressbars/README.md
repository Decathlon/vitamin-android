# Progressbar component

## Progressbar design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default 
`LinearProgressIndicator` or `CircularProgressIndicator` component from material 
component library.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

> **Note:** Vitamin doesn't provide a kotlin class for these components because
> we can't extend the material class (see [GitHub Issue](https://github.com/material-components/material-components-android/issues/2361))

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

```xml
<!-- Linear progress bar -->
<com.google.android.material.progressindicator.LinearProgressIndicator
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />

<!-- Circular progress bar -->
<com.google.android.material.progressindicator.CircularProgressIndicator
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) 
on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <!-- Linear progress bar -->
    <com.google.android.material.progressindicator.LinearProgressIndicator
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <!-- Circular progress bar -->
    <com.google.android.material.progressindicator.CircularProgressIndicator
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Styles

Element | Style
--------|------
Small Linear Progressbar | `Widget.Vitamin.LinearProgressBar.Small`
Medium Linear Progressbar | `Widget.Vitamin.LinearProgressBar.Medium`
Large Linear Progressbar | `Widget.Vitamin.LinearProgressBar.Large`
ExtraSmall Circular Linear Progressbar | `Widget.Vitamin.CircularProgressBar.ExtraSmall`
Small Circular Linear Progressbar | `Widget.Vitamin.CircularProgressBar.Small`
Medium Circular Linear Progressbar | `Widget.Vitamin.CircularProgressBar.Medium`
Large Circular Linear Progressbar | `Widget.Vitamin.CircularProgressBar.Large`

Default linear style theme attribute is Small

Default circular style theme attribute is Medium
