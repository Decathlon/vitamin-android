# Switch component

## Switch design specs
You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `SwitchMaterial` component or the `VitaminSwitch` component. 

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```
```xml
<com.decathlon.vitamin.switches.VitaminSwitch
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My switch component" />
```

or 

```xml
<com.google.android.material.switchmaterial.SwitchMaterial
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My switch component" />
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin switch style.
You can now use the switch component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:switches:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!-- Vitamin Switches -->
        <item name="vtmnSwitchStyle">@style/Widget.Vitamin.Switch</item>
        <!-- Material Switches -->
        <item name="switchStyle">?attr/vtmnSwitchStyle</item>
    </style>
</resources>
```

```xml
<com.decathlon.vitamin.switches.VitaminSwitch
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My switch component" />
```

```xml
<com.google.android.material.switchmaterial.SwitchMaterial
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My switch component" />
```

### Version 2

If you don't want to override all the switch components of your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:switches:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<com.google.android.material.switchmaterial.SwitchMaterial
    style="@style/Widget.Vitamin.Switch"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:checked="true"
    android:text="My switch component" />
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

    <com.decathlon.vitamin.switches.VitaminSwitch
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:checked="true"
        android:text="My switch component" />

</androidx.constraintlayout.widget.ConstraintLayout>
```