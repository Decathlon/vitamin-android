# Button component

## Button design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `Button` component or the `Vitamin*Button` component.

```kotlin
implementation("com.decathlon.vitamin:buttons:<version>")
```

### Primary Button

```xml
<com.decathlon.vitamin.buttons.VitaminPrimaryButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

### Primary Reversed Button

```xml
<com.decathlon.vitamin.buttons.VitaminPrimaryReversedButton
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    style="?attr/buttonReverseStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

### Secondary Button

```xml
<com.decathlon.vitamin.buttons.VitaminSecondaryButton
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    style="?attr/buttonSecondary"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

### Ghost Button

```xml
<com.decathlon.vitamin.buttons.VitaminGhostButton
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    style="?attr/buttonGhost"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

### Ghost Reversed Button

```xml
<com.decathlon.vitamin.buttons.VitaminGhostReversedButton
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    style="?attr/buttonGhostReversed"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

### Conversion Button

```xml
<com.decathlon.vitamin.buttons.VitaminConversionButton
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    style="?attr/buttonConversionStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin button styles.
You can now use the button component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:buttons:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!-- Buttons -->
        <item name="buttonStyle">@style/Widget.Vitamin.Button.Primary</item>
        <item name="materialButtonStyle">@style/Widget.Vitamin.Button.Primary</item>
        <item name="materialButtonOutlinedStyle">@style/Widget.Vitamin.Button.Secondary</item>
        <item name="borderlessButtonStyle">@style/Widget.Vitamin.Button.Ghost</item>
        <!-- Custom Buttons Styles -->
        <item name="buttonReverseStyle">@style/Widget.Vitamin.Button.Primary.Reverse</item>
        <item name="buttonConversionStyle">@style/Widget.Vitamin.Button.Conversion</item>
        <item name="buttonSecondary">@style/Widget.Vitamin.Button.Secondary</item>
        <item name="buttonSecondaryReversed">@style/Widget.Vitamin.Button.Secondary.Reversed</item>
        <item name="buttonGhost">@style/Widget.Vitamin.Button.Ghost</item>
        <item name="buttonGhostReversed">@style/Widget.Vitamin.Button.Ghost.Reversed</item>
    </style>
</resources>
```

```xml
<com.decathlon.vitamin.buttons.VitaminPrimaryButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

### Version 2

If you don't want to override all the button components or your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:buttons:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<com.google.android.material.button.MaterialButton
    style="@style/Widget.Vitamin.Button.Primary"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

### Version 3

If you don't want to use Vitamin colors and font on all your app, you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<com.decathlon.vitamin.buttons.VitaminPrimaryButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```
