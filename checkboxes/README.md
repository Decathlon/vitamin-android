# Checkbox component

## Checkbox design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `Checkbox` component or the `VitaminCheckbox` component. 

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
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

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin checkbox style.
You can now use the checkbox component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:checkboxes:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!--  Vitamin Checkboxes -->
        <item name="vtmnCheckboxStyle">@style/Widget.Vitamin.Checkbox</item>
        <!--  Material Checkboxes -->
        <item name="checkboxStyle">?attr/vtmnCheckboxStyle</item>
    </style>
</resources>
```

```xml
<com.decathlon.vitamin.checkboxes.VitaminCheckbox
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My checkbox component" />
```

```xml
<com.google.android.material.checkbox.MaterialCheckBox
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My checkbox component" />
```

### Version 2

If you don't want to override all the checkbox components of your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:checkboxes:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<com.google.android.material.checkbox.MaterialCheckBox
    style="@style/Widget.Vitamin.Checkbox"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My checkbox component" />
```

### Version 3

If you don't want to use Vitamin colors and font on all your app, you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin">

    <com.decathlon.vitamin.checkboxes.VitaminCheckbox
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:checked="true"
        android:text="My checkbox component" />

</androidx.constraintlayout.widget.ConstraintLayout>
```