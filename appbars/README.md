# AppBar components

## AppBar design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default material
component or the Vitamin subclass component.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
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

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.appbars.VitaminTopBar
        style="?attr/vtmnTopBarStyle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:menu="@menu/menu_topbar"
        app:title="Toolbar Title" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
