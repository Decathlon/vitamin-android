# AppBar components

## AppBar design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default material
component or the Vitamin subclass component.

```kotlin
implementation("com.decathlon.vitamin:appbars:<version>")
```

### TopBar

```xml
<com.decathlon.vitamin.appbars.VitaminTopBar
    style="?attr/vtmnTopBarStyle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:menu="@menu/menu_topbar"
    app:title="Toolbar Title" />
```

or

```xml
<com.google.android.material.appbar.MaterialToolbar
    style="?attr/vtmnTopBarStyle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:menu="@menu/menu_topbar"
    app:title="Toolbar Title" />
```

### Search TopBar

```xml
<com.decathlon.vitamin.appbars.VitaminSearchTopBar
    style="?attr/vtmnSearchTopBarStyle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <androidx.appcompat.widget.SearchView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:queryHint="Placeholder" />
</com.decathlon.vitamin.appbars.VitaminSearchTopBar>
```

or

```xml
<com.google.android.material.appbar.MaterialToolbar
    style="?attr/vtmnSearchTopBarStyle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <androidx.appcompat.widget.SearchView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:queryHint="Placeholder" />
</com.google.android.material.appbar.MaterialToolbar>
```

### Bottom Navigation

```xml
<com.decathlon.vitamin.appbars.VitaminBottomNavigation
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom"
    app:menu="@menu/menu_bottomnav"/>
```

or

```xml
<com.google.android.material.bottomnavigation.BottomNavigationView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="bottom"
    app:menu="@menu/menu_bottomnav"/>
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your
entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the
Vitamin appbars styles. You can now use appbar components as seen previously.

```kotlin
implementation("com.decathlon.vitamin:appbars:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!-- Vitamin AppBars -->
        <item name="vtmnTopBarStyle">@style/Widget.Vitamin.TopBar</item>
        <item name="vtmnSearchTopBarStyle">@style/Widget.Vitamin.TopBar.Search</item>
        <item name="vtmnBottomNavigationStyle">@style/Widget.Vitamin.BottomNavigation</item>
        <!-- Material AppBars -->
        <item name="windowActionModeOverlay">true</item>
        <item name="actionModeCloseDrawable">@drawable/ic_vtmn_close_line</item>
        <item name="appBarLayoutStyle">@style/Widget.Vitamin.AppBarLayout</item>
        <item name="toolbarStyle">@style/Widget.Vitamin.TopBar</item>
        <item name="actionBarStyle">@style/Widget.Vitamin.TopBar</item>
        <item name="actionModeStyle">@style/Widget.Vitamin.ActionMode</item>
        <item name="actionOverflowButtonStyle">@style/Widget.Vitamin.ActionButton.Overflow</item>
        <item name="android:actionOverflowButtonStyle">@style/Widget.Vitamin.ActionButton.Overflow</item>
        <item name="actionBarTheme">@style/ThemeOverlay.Vitamin.ActionBar</item>
        <item name="searchViewStyle">@style/Widget.Vitamin.SearchView</item>
        <item name="bottomNavigationStyle">@style/Widget.Vitamin.BottomNavigation</item>
    </style>
</resources>
```

### Version 2

If you don't want to override all the appbar components of your app, you can inherit
the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:appbars:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<com.google.android.material.appbar.MaterialToolbar
    style="@style/Widget.Vitamin.TopBar"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:menu="@menu/menu_topbar"
    app:title="Toolbar Title" />
```

### Version 3

If you don't want to use Vitamin colors and font on all your app, you can directly use the
Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:theme="@style/Theme.Vitamin">

    <com.decathlon.vitamin.appbars.VitaminTopBar
        style="?attr/vtmnTopBarStyle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:menu="@menu/menu_topbar"
        app:title="Toolbar Title" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
