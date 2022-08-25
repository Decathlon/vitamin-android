# Dividers component

## Divider design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

### Divider

You can use divider as a simple view :

```kotlin 
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
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
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

```kotlin
recyclerView.addItemDecoration(VitaminFullBleedDividerItemDecoration(context, DividerItemDecoration.VERTICAL))
recyclerView.addItemDecoration(VitaminFullBleedDividerItemDecoration(context, DividerItemDecoration.HORIZONTAL))
```

### Variants

You can use the three dividers variants : 

| XML divider                                              | Kotlin divider            | Kotlin dividerItemDecoration            | Theme style                 |
|----------------------------------------------------------|---------------------------|-----------------------------------------|-----------------------------|
| `com.decathlon.vitamin.dividers.VitaminFullBleedDivider` | `VitaminFullBleedDivider` | `VitaminFullBleedDividerItemDecoration` | `vtmnDividerFullBleedStyle` |
| `com.decathlon.vitamin.dividers.VitaminInsetDivider`     | `VitaminInsetDivider`     | `VitaminInsetDividerItemDecoration`     | `vtmnDividerInsetStyle`     |
| `com.decathlon.vitamin.dividers.VitaminMiddleDivider`    | `VitaminMiddleDivider`    | `VitaminMiddleDividerItemDecoration`    | `vtmnDividerMiddleStyle`    |

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
    <!-- Use this view context to create the DividerItemDecoration -->
    
    <!-- Put here your recyclerView or divider views -->
    
</androidx.constraintlayout.widget.ConstraintLayout>
```