# Checkbox component

## Checkbox design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `Checkbox` component or the `VitaminCheckbox` component.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

```xml
<com.decathlon.vitamin.checkboxes.VitaminCheckbox
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My checkbox component" />
```

or 

```xml
<com.google.android.material.checkbox.MaterialCheckBox
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My checkbox component" />
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.checkboxes.VitaminCheckbox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:checked="true"
        android:text="My checkbox component" />

</androidx.constraintlayout.widget.ConstraintLayout>
```