# Button component

## Button design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `Button` component or the `Vitamin*Button` component.

```kotlin
implementation("com.decathlon.vitamin:buttons:<version>")
```

```xml
<com.decathlon.vitamin.buttons.VitaminPrimaryMediumButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    style="?attr/buttonPrimaryMedium"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

With the same usage as above, you have multiple button types available: 

| Button type             | Kotlin Class                         | Attribute style                     |
|-------------------------|--------------------------------------|-------------------------------------|
| Primary Medium          | `VitaminPrimaryMediumButton`         | `?attr/buttonPrimaryMedium`         |
| Primary Large           | `VitaminPrimaryLargeButton`          | `?attr/buttonPrimaryLarge`          |
| Secondary Medium        | `VitaminSecondaryMediumButton`       | `?attr/buttonSecondaryMedium`       |
| Secondary Large         | `VitaminSecondaryLargeButton`        | `?attr/buttonSecondaryLarge`        |
| Tertiary Medium         | `VitaminTertiaryMediumButton`        | `?attr/buttonTertiaryMedium`        |
| Tertiary Large          | `VitaminTertiaryLargeButton`         | `?attr/buttonTertiaryLarge`         |
| Conversion Medium       | `VitaminConversionMediumButton`      | `?attr/buttonConversionMedium`      |
| Conversion Large        | `VitaminConversionLargeButton`       | `?attr/buttonConversionLarge`       |
| Primary Reversed Medium | `VitaminPrimaryReversedMediumButton` | `?attr/buttonPrimaryReversedMedium` |
| Primary Reversed Large  | `VitaminPrimaryReversedLargeButton`  | `?attr/buttonPrimaryReversedLarge`  |
| Ghost Medium            | `VitaminGhostMediumButton`           | `?attr/buttonGhostMedium`           |
| Ghost Large             | `VitaminGhostLargeButton`            | `?attr/buttonGhostLarge`            |
| Ghost Reversed Medium   | `VitaminGhostReversedMediumButton`   | `?attr/buttonGhostReversedMedium`   |
| Ghost Reversed Large    | `VitaminGhostReversedLargeButton`    | `?attr/buttonGhostReversedLarge`    |

Deprecated types: 

| Deprecated Button type | Deprecated Kotlin Class        | Deprecated Attribute style    | Redirected Button type  |
|------------------------|--------------------------------|-------------------------------|-------------------------|
| Primary                | `VitaminPrimaryButton`         | N/A                           | Primary Medium          |
| Secondary              | `VitaminSecondaryButton`       | `?attr/buttonSecondary`       | Secondary Medium        |
| Conversion             | `VitaminConversionButton`      | `?attr/buttonConversionStyle` | Conversion Medium       |
| Primary Reversed       | `VitaminPrimaryReversedButton` | `?attr/buttonReverseStyle`    | Primary Reversed Medium |
| Ghost                  | `VitaminGhostButton`           | `?attr/buttonGhost`           | Ghost Medium            |
| Ghost Reversed         | `VitaminGhostReversedButton`   | `?attr/buttonGhostReversed`   | Ghost Reversed Medium   |

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
        <item name="buttonStyle">@style/Widget.Vitamin.Button.Primary.Medium</item>
        <item name="materialButtonStyle">@style/Widget.Vitamin.Button.Primary.Medium</item>
        <item name="materialButtonOutlinedStyle">@style/Widget.Vitamin.Button.Secondary.Medium</item>
        <item name="borderlessButtonStyle">@style/Widget.Vitamin.Button.Ghost.Medium</item>
        <!-- Custom Buttons Styles -->
        <item name="buttonPrimaryMedium">@style/Widget.Vitamin.Button.Primary.Medium</item>
        <item name="buttonPrimaryLarge">@style/Widget.Vitamin.Button.Primary.Large</item>
        <item name="buttonSecondaryMedium">@style/Widget.Vitamin.Button.Secondary.Medium</item>
        <item name="buttonSecondaryLarge">@style/Widget.Vitamin.Button.Secondary.Large</item>
        <item name="buttonTertiaryMedium">@style/Widget.Vitamin.Button.Tertiary.Medium</item>
        <item name="buttonTertiaryLarge">@style/Widget.Vitamin.Button.Tertiary.Large</item>
        <item name="buttonConversionMedium">@style/Widget.Vitamin.Button.Conversion.Medium</item>
        <item name="buttonConversionLarge">@style/Widget.Vitamin.Button.Conversion.Large</item>
        <item name="buttonPrimaryReversedMedium">@style/Widget.Vitamin.Button.PrimaryReversed.Medium</item>
        <item name="buttonPrimaryReversedLarge">@style/Widget.Vitamin.Button.PrimaryReversed.Large</item>
        <item name="buttonGhostMedium">@style/Widget.Vitamin.Button.Ghost.Medium</item>
        <item name="buttonGhostLarge">@style/Widget.Vitamin.Button.Ghost.Large</item>
        <item name="buttonGhostReversedMedium">@style/Widget.Vitamin.Button.GhostReversed.Medium</item>
        <item name="buttonGhostReversedLarge">@style/Widget.Vitamin.Button.GhostReversed.Large</item>
    </style>
</resources>
```

```xml
<com.decathlon.vitamin.buttons.VitaminPrimaryMediumButton
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
    style="@style/Widget.Vitamin.Button.Primary.Medium"
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
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin">

    <com.decathlon.vitamin.buttons.VitaminPrimaryMediumButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="My Button" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
