# Price component

## Price design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you can use the `Vitamin*Price` component.

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
<com.decathlon.vitamin.prices.VitaminPriceDefaultSmall 
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" 
    android:text="150 €" />
```

With the same usage as above, you have multiple price types available:

| Button type             | Kotlin Class                         | Attribute style                              |
|-------------------------|--------------------------------------|----------------------------------------------|
| Default Small           | `VitaminPriceDefaultSmall`           | `?attr/vtmnPriceDefaultSmallStyle`           |
| Default Medium          | `VitaminPriceDefaultMedium`          | `?attr/vtmnPriceDefaultMediumStyle`          |
| Default Large           | `VitaminPriceDefaultLarge`           | `?attr/vtmnPriceDefaultLargeStyle`           |
| Accent Small            | `VitaminPriceAccentSmall`            | `?attr/vtmnPriceAccentSmallStyle`            |
| Accent Medium           | `VitaminPriceAccentMedium`           | `?attr/vtmnPriceAccentMediumStyle`           |
| Accent Large            | `VitaminPriceAccentLarge`            | `?attr/vtmnPriceAccentLargeStyle`            |
| Alert Small             | `VitaminPriceAlertSmall`             | `?attr/vtmnPriceAlertSmallStyle`             |
| Alert Medium            | `VitaminPriceAlertMedium`            | `?attr/vtmnPriceAlertMediumStyle`            |
| Alert Large             | `VitaminPriceAlertLarge`             | `?attr/vtmnPriceAlertLargeStyle`             |
| Strikethrough Small     | `VitaminPriceStrikethroughSmall`     | `?attr/vtmnPriceStrikethroughSmallStyle`     |
| Strikethrough Medium    | `VitaminPriceStrikethroughMedium`    | `?attr/vtmnPriceStrikethroughMediumStyle`    |
| Strikethrough Large     | `VitaminPriceStrikethroughLarge`     | `?attr/vtmnPriceStrikethroughLargeStyle`     |

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire
app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">
    
    <com.decathlon.vitamin.prices.VitaminPriceDefaultSmall
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="150 €" />
    
</androidx.constraintlayout.widget.ConstraintLayout>
```
