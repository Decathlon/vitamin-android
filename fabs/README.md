# FloatingActionButton component

## FloatingActionButton design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `FloatingActionButton` component or the `VitaminFloatingActionButton` component.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

### Regular

```xml
<com.decathlon.vitamin.fabs.VitaminFloatingActionButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:srcCompat="@drawable/ic_vtmn_add_fill" />
```

or

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:srcCompat="@drawable/ic_vtmn_add_fill" />
```

### Mini

```xml
<com.decathlon.vitamin.fabs.VitaminMiniFloatingActionButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:srcCompat="@drawable/ic_vtmn_add_fill" />
```

or

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
    style="@style/Widget.Vitamin.MiniFloatingActionButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:srcCompat="@drawable/ic_vtmn_add_fill" />
```

### Extended

```xml
<com.decathlon.vitamin.fabs.VitaminExtendedFloatingActionButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Text"
    app:icon="@drawable/ic_vtmn_add_fill" />
```

or

```xml
<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Text"
    app:icon="@drawable/ic_vtmn_add_fill" />
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin floating action button styles.
You can now use the floating action button component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:fabs:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!-- Vitamin FloatingActionButtons -->
        <item name="vtmnFloatingActionButtonStyle">@style/Widget.Vitamin.FloatingActionButton</item>
        <item name="vtmnMiniFloatingActionButtonStyle">
            @style/Widget.Vitamin.MiniFloatingActionButton
        </item>
        <item name="vtmnExtendedFloatingActionButtonStyle">
            @style/Widget.Vitamin.ExtendedFloatingActionButton
        </item>
        <!-- Material FloatingActionButtons -->
        <item name="floatingActionButtonStyle">?attr/vtmnFloatingActionButtonStyle</item>
        <item name="extendedFloatingActionButtonStyle">
            ?attr/vtmnExtendedFloatingActionButtonStyle
        </item>
    </style>
</resources>
```

```xml
<com.decathlon.vitamin.fabs.VitaminFloatingActionButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:srcCompat="@drawable/ic_vtmn_add_fill" />
```

or

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:srcCompat="@drawable/ic_vtmn_add_fill" />
```

### Version 2

If you don't want to override all the floating action button components of your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:fabs:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
    style="@style/Widget.Vitamin.FloatingActionButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:srcCompat="@drawable/ic_vtmn_add_fill" />
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

    <com.decathlon.vitamin.fabs.VitaminFloatingActionButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:srcCompat="@drawable/ic_vtmn_add_fill" />

</androidx.constraintlayout.widget.ConstraintLayout>
```