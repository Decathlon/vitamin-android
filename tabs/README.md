# Tabs component

## Tab design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `TabLayout` component with vitamin styles or directly the different vitamin TabLayout components.

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
<com.decathlon.vitamin.tabs.VitaminTabLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.google.android.material.tabs.TabItem
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Label" />

</com.decathlon.vitamin.tabs.VitaminTabLayout>
```

or

```xml
<com.google.android.material.tabs.TabLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    style="?attr/vtmnTabStyle">

    <com.google.android.material.tabs.TabItem
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Label" />

</com.google.android.material.tabs.TabLayout>

```

With the same usage as above, you have multiple TabLayout types available:

| Button type             | Kotlin Class                         | Attribute style                              |
|-------------------------|--------------------------------------|----------------------------------------------|
| Tab Layout              | `VitaminTabLayout`                   | `?attr/vtmnTabStyle`                         |
| Tab Layout Leading Icon | `VitaminTabLayoutLeadingIcon`        | `?attr/vtmnTabLeadingIconStyle`              |
| Tab Layout Top Icon     | `VitaminTabLayoutTopIcon`            | `?attr/vtmnTabTopIconStyle`                  |


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

    <com.decathlon.vitamin.tabs.VitaminTabLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <com.google.android.material.tabs.TabItem
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Label" />

    </com.decathlon.vitamin.tabs.VitaminTabLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
```
