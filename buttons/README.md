# Button component

## Button design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `Button` component or the `Vitamin*Button` component.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

**Buttons**

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

**Icon Buttons**

```xml
<com.decathlon.vitamin.buttons.VitaminPrimaryMediumIconButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:icon="@drawable/ic_vtmn_add" />
```

or

```xml
<com.google.android.material.button.MaterialButton
    style="?attr/vtmnIconButtonPrimaryMediumStyle"
    android:layout_width="@dimen/vtmn_icon_buttons_size_medium"
    android:layout_height="@dimen/vtmn_icon_buttons_size_medium"
    app:icon="@drawable/ic_vtmn_add" />
```

With the same usage as above, you have multiple button types available: 

**Buttons**

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

**Icon Buttons**

| Icon Button type        | Kotlin Class                             | Attribute style                                  |
|-------------------------|------------------------------------------|--------------------------------------------------|
| Primary Medium          | `VitaminPrimaryMediumIconButton`         | `?attr/vtmnIconButtonPrimaryMediumStyle`         |
| Primary Large           | `VitaminPrimaryLargeIconButton`          | `?attr/vtmnIconButtonPrimaryLargeStyle`          |
| Secondary Medium        | `VitaminSecondaryMediumIconButton`       | `?attr/vtmnIconButtonSecondaryMediumStyle`       |
| Secondary Large         | `VitaminSecondaryLargeIconButton`        | `?attr/vtmnIconButtonSecondaryLargeStyle`        |
| Tertiary Medium         | `VitaminTertiaryMediumIconButton`        | `?attr/vtmnIconButtonTertiaryMediumStyle`        |
| Tertiary Large          | `VitaminTertiaryLargeIconButton`         | `?attr/vtmnIconButtonTertiaryLargeStyle`         |
| Conversion Medium       | `VitaminConversionMediumIconButton`      | `?attr/vtmnIconButtonConversionMediumStyle`      |
| Conversion Large        | `VitaminConversionLargeIconButton`       | `?attr/vtmnIconButtonConversionLargeStyle`       |
| Primary Reversed Medium | `VitaminPrimaryReversedMediumIconButton` | `?attr/vtmnIconButtonPrimaryReversedMediumStyle` |
| Primary Reversed Large  | `VitaminPrimaryReversedLargeIconButton`  | `?attr/vtmnIconButtonPrimaryReversedLargeStyle`  |
| Ghost Medium            | `VitaminGhostMediumIconButton`           | `?attr/vtmnIconButtonGhostMediumStyle`           |
| Ghost Large             | `VitaminGhostLargeIconButton`            | `?attr/vtmnIconButtonGhostLargeStyle`            |
| Ghost Reversed Medium   | `VitaminGhostReversedMediumIconButton`   | `?attr/vtmnIconButtonGhostReversedMediumStyle`   |
| Ghost Reversed Large    | `VitaminGhostReversedLargeIconButton`    | `?attr/vtmnIconButtonGhostReversedLargeStyle`    |

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

**Buttons**

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.buttons.VitaminPrimaryMediumButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="My Button" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

**Icon Buttons**

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.buttons.VitaminPrimaryMediumIconButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:icon="@drawable/ic_vtmn_add" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

**Button with text & icon**

```xml
 <com.decathlon.vitamin.buttons.VitaminGhostMediumButton
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="My button"
            app:icon="@drawable/ic_scan"
            app:iconGravity="textStart" />
```
