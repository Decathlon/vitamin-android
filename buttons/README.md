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
    style="?attr/vtmnButtonPrimaryMediumStyle"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Button" />
```

With the same usage as above, you have multiple button types available: 

| Button type             | Kotlin Class                         | Attribute style                              |
|-------------------------|--------------------------------------|----------------------------------------------|
| Primary Medium          | `VitaminPrimaryMediumButton`         | `?attr/vtmnButtonPrimaryMediumStyle`         |
| Primary Large           | `VitaminPrimaryLargeButton`          | `?attr/vtmnButtonPrimaryLargeStyle`          |
| Secondary Medium        | `VitaminSecondaryMediumButton`       | `?attr/vtmnButtonSecondaryMediumStyle`       |
| Secondary Large         | `VitaminSecondaryLargeButton`        | `?attr/vtmnButtonSecondaryLargeStyle`        |
| Tertiary Medium         | `VitaminTertiaryMediumButton`        | `?attr/vtmnButtonTertiaryMediumStyle`        |
| Tertiary Large          | `VitaminTertiaryLargeButton`         | `?attr/vtmnButtonTertiaryLargeStyle`         |
| Conversion Medium       | `VitaminConversionMediumButton`      | `?attr/vtmnButtonConversionMediumStyle`      |
| Conversion Large        | `VitaminConversionLargeButton`       | `?attr/vtmnButtonConversionLargeStyle`       |
| Primary Reversed Medium | `VitaminPrimaryReversedMediumButton` | `?attr/vtmnButtonPrimaryReversedMediumStyle` |
| Primary Reversed Large  | `VitaminPrimaryReversedLargeButton`  | `?attr/vtmnButtonPrimaryReversedLargeStyle`  |
| Ghost Medium            | `VitaminGhostMediumButton`           | `?attr/vtmnButtonGhostMediumStyle`           |
| Ghost Large             | `VitaminGhostLargeButton`            | `?attr/vtmnButtonGhostLargeStyle`            |
| Ghost Reversed Medium   | `VitaminGhostReversedMediumButton`   | `?attr/vtmnButtonGhostReversedMediumStyle`   |
| Ghost Reversed Large    | `VitaminGhostReversedLargeButton`    | `?attr/vtmnButtonGhostReversedLargeStyle`    |

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
        <!-- Vitamin Buttons -->
        <item name="vtmnButtonPrimaryMediumStyle">@style/Widget.Vitamin.Button.Primary.Medium</item>
        <item name="vtmnButtonPrimaryLargeStyle">@style/Widget.Vitamin.Button.Primary.Large</item>
        <item name="vtmnButtonSecondaryMediumStyle">@style/Widget.Vitamin.Button.Secondary.Medium</item>
        <item name="vtmnButtonSecondaryLargeStyle">@style/Widget.Vitamin.Button.Secondary.Large</item>
        <item name="vtmnButtonTertiaryMediumStyle">@style/Widget.Vitamin.Button.Tertiary.Medium</item>
        <item name="vtmnButtonTertiaryLargeStyle">@style/Widget.Vitamin.Button.Tertiary.Large</item>
        <item name="vtmnButtonConversionMediumStyle">@style/Widget.Vitamin.Button.Conversion.Medium</item>
        <item name="vtmnButtonConversionLargeStyle">@style/Widget.Vitamin.Button.Conversion.Large</item>
        <item name="vtmnButtonPrimaryReversedMediumStyle">
            @style/Widget.Vitamin.Button.PrimaryReversed.Medium
        </item>
        <item name="vtmnButtonPrimaryReversedLargeStyle">
            @style/Widget.Vitamin.Button.PrimaryReversed.Large
        </item>
        <item name="vtmnButtonGhostMediumStyle">@style/Widget.Vitamin.Button.Ghost.Medium</item>
        <item name="vtmnButtonGhostLargeStyle">@style/Widget.Vitamin.Button.Ghost.Large</item>
        <item name="vtmnButtonGhostReversedMediumStyle">@style/Widget.Vitamin.Button.GhostReversed.Medium
        </item>
        <item name="vtmnButtonGhostReversedLargeStyle">
            @style/Widget.Vitamin.Button.GhostReversed.Large
        </item>
        <!-- Material Buttons -->
        <item name="buttonStyle">?attr/vtmnButtonPrimaryMediumStyle</item>
        <item name="materialButtonStyle">?attr/vtmnButtonPrimaryMediumStyle</item>
        <item name="materialButtonOutlinedStyle">?attr/vtmnButtonSecondaryMediumStyle</item>
        <item name="borderlessButtonStyle">?attr/vtmnButtonGhostMediumStyle</item>
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
