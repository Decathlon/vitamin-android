# Price component

## Price design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you can use the `Vitamin*Price` component.

```kotlin
implementation("com.decathlon.vitamin:prices:<version>")
```

```xml
<com.decathlon.vitamin.prices.VitaminPriceDefaultSmall 
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" 
    android:text="150 €" />
```

With the same usage as above, you have multiple price types available:

| Button type             | Kotlin Class                         | Attribute style                     |
|-------------------------|--------------------------------------|-------------------------------------|
| Default Small           | `VitaminPriceDefaultSmall`           | `?attr/priceDefaultSmall`           |
| Default Medium          | `VitaminPriceDefaultMedium`          | `?attr/priceDefaultMedium`          |
| Default Large           | `VitaminPriceDefaultLarge`           | `?attr/priceDefaultLarge`           |
| Accent Small            | `VitaminPriceAccentSmall`            | `?attr/priceAccentSmall`            |
| Accent Medium           | `VitaminPriceAccentMedium`            | `?attr/priceAccentMedium`           |
| Accent Large            | `VitaminPriceAccentLarge`            | `?attr/priceAccentLarge`            |
| Alert Small             | `VitaminPriceAlertSmall`             | `?attr/priceAlertSmall`             |
| Alert Medium            | `VitaminPriceAlertMedium`            | `?attr/priceAlertMedium`            |
| Alert Large             | `VitaminPriceAlertLarge`             | `?attr/priceAlertLarge`             |
| Strikethrough Small     | `VitaminPriceStrikethroughSmall`     | `?attr/priceStrikethroughSmall`     |
| Strikethrough Medium    | `VitaminPriceStrikethroughMedium`    | `?attr/priceStrikethroughMedium`    |
| Strikethrough Large     | `VitaminPriceStrikethroughLarge`     | `?attr/priceStrikethroughLarge`    |

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire
app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin
price styles. You can now use the price component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:prices:<version>")
```

```xml

<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!-- Prices -->
        <item name="priceDefaultSmall">@style/Widget.Vitamin.Price.Default.Small</item>
        <item name="priceDefaultMedium">@style/Widget.Vitamin.Price.Default.Medium</item>
        <item name="priceDefaultLarge">@style/Widget.Vitamin.Price.Default.Large</item>
        <item name="priceAccentSmall">@style/Widget.Vitamin.Price.Accent.Small</item>
        <item name="priceAccentMedium">@style/Widget.Vitamin.Price.Accent.Medium</item>
        <item name="priceAccentLarge">@style/Widget.Vitamin.Price.Accent.Large</item>
        <item name="priceAlertSmall">@style/Widget.Vitamin.Price.Alert.Small</item>
        <item name="priceAlertMedium">@style/Widget.Vitamin.Price.Alert.Medium</item>
        <item name="priceAlertLarge">@style/Widget.Vitamin.Price.Alert.Large</item>
        <item name="priceStrikethroughSmall">@style/Widget.Vitamin.Price.Strikethrough.Small</item>
        <item name="priceStrikethroughMedium">@style/Widget.Vitamin.Price.Strikethrough.Medium</item>
        <item name="priceStrikethroughLarge">@style/Widget.Vitamin.Price.Strikethrough.Large</item>
    </style>
</resources>
```

```xml

<com.decathlon.vitamin.prices.VitaminPriceDefaultSmall
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="150 €" />
```

### Version 2

You can also inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:prices:<version>")
```

```xml

<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml

<com.google.android.material.textview.MaterialTextView
    style="@style/Widget.Vitamin.Price.Default.Small" 
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" 
    android:text="150 €" />
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
    
    <com.decathlon.vitamin.prices.VitaminPriceDefaultSmall
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="150 €" />
    
</androidx.constraintlayout.widget.ConstraintLayout>
```
