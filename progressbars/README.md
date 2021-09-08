# Progressbar component

## Progressbar design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default 
`LinearProgressIndicator` or `CircularProgressIndicator` component from material 
component library.

> **Note:** Vitamin doesn't provide a kotlin class for these components because
> we can't extend the material class (see [GitHub Issue](https://github.com/material-components/material-components-android/issues/2361))

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
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

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and 
link the Vitamin progress indicator styles. You can now use the linear or circular
progress indicator components as seen previously.

```kotlin
implementation("com.decathlon.vitamin:progressbars:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="linearProgressIndicatorStyle">@style/Widget.Vitamin.LinearProgressBar</item>
        <item name="circularProgressIndicatorStyle">@style/Widget.Vitamin.CircularProgressBar</item>
    </style>
</resources>
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

### Version 2

If you don't want to override all the progress bar components of your app, 
you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:progressbars:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<!-- Linear progress bar -->
<com.google.android.material.progressindicator.LinearProgressIndicator
    style="@style/Widget.Vitamin.LinearProgressBar.Medium"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />

<!-- Circular progress bar -->
<com.google.android.material.progressindicator.CircularProgressIndicator
    style="@style/Widget.Vitamin.CircularProgressBar.Medium"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

### Version 3

If you don't want to use Vitamin colors and font on all your app, 
you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin">

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
