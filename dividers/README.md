# Dividers component

## Divider design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

### Divider

You can use divider as a simple view :

```kotlin 
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="Your.AppTheme" parent="Theme.Vitamin">
    ...
</style>
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    
    <View
        ...
    />

    <com.decathlon.vitamin.dividers.VitaminFullBleedDivider
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <View
    ...
    />
    
</androidx.constraintlayout.widget.ConstraintLayout>
```

### DividerItemDecoration

You can also use divider as recyclerView item decoration : 

```kotlin 
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="Your.AppTheme" parent="Theme.Vitamin">
    ...
</style>
```

```kotlin
recyclerView.addItemDecoration(VitaminFullBleedDividerItemDecoration(context, DividerItemDecoration.VERTICAL))
recyclerView.addItemDecoration(VitaminFullBleedDividerItemDecoration(context, DividerItemDecoration.HORIZONTAL))
```

### Variants

You can use the three dividers variants : 

| XML divider                                              | Kotlin divider            | Kotlin dividerItemDecoration            | Theme style        |
|----------------------------------------------------------|---------------------------|-----------------------------------------|--------------------|
| `com.decathlon.vitamin.dividers.VitaminFullBleedDivider` | `VitaminFullBleedDivider` | `VitaminFullBleedDividerItemDecoration` | `dividerFullBleed` |
| `com.decathlon.vitamin.dividers.VitaminInsetDivider`     | `VitaminInsetDivider`     | `VitaminInsetDividerItemDecoration`     | `dividerInset`     |
| `com.decathlon.vitamin.dividers.VitaminMiddleDivider`    | `VitaminMiddleDivider`    | `VitaminMiddleDividerItemDecoration`    | `dividerMiddle`    |

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin dividers styles.
You can now use the dividers as seen previously.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<resources>
    <style name="Your.AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="materialDividerStyle">@style/Widget.Vitamin.Divider.FullBleed</item>
        <item name="dividerFullBleed">@style/Widget.Vitamin.Divider.FullBleed</item>
        <item name="dividerInset">@style/Widget.Vitamin.Divider.Inset</item>
        <item name="dividerMiddle">@style/Widget.Vitamin.Divider.Middle</item>
        <item name="android:listDivider">?attr/vtmnBorderSecondary</item>
    </style>
</resources>
```

### Version 2

If you don't want to use Vitamin colors and font on all your app, you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin">
    <!-- Use this view context to create the DividerItemDecoration -->
    
    <!-- Put here your recyclerView or divider views -->
    
</androidx.constraintlayout.widget.ConstraintLayout>
```