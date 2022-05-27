# Tabs component

## Tab design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `TabLayout` component with vitamin styles or directly the different vitamin TabLayout components.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
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
| Tab Layout              | `TabLayout`                          | `?attr/vtmnTabStyle`                         |
| Tab Layout Leading Icon | `VitaminTabLayoutLeadingIcon`        | `?attr/vtmnTabStyleLeadingIcon`              |
| Tab Layout Top Icon     | `VitaminTabLayoutTopIcon`            | `?attr/vtmnTabStyleTopIcon`                  |


## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin TabLayout styles.
You can now use the TabLayout component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:tabs:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!-- Vitamin Tabs -->
        <item name="vtmnTabStyle">@style/Widget.Vitamin.TabLayout</item>
        <item name="vtmnTabStyleLeadingIcon">@style/Widget.Vitamin.TabLayout.LeadingIcon</item>
        <item name="vtmnTabStyleTopIcon">@style/Widget.Vitamin.TabLayout.TopIcon</item>

        <!-- Material Tabs -->
        <item name="tabStyle">@style/Widget.Vitamin.TabLayout</item>
    </style>
</resources>
```

### Version 2

If you don't want to override all the TabLayout components of your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:tabs:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<com.google.android.material.tabs.TabLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    style="@style/Widget.Vitamin.TabLayout">

    <com.google.android.material.tabs.TabItem
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Label" />
    
</com.google.android.material.tabs.TabLayout>
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
