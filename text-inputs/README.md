# TextInput component

## TextInput design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `TextInputLayout` component or the `VitaminTextInputLayout*` component.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

### Filled

```xml
<com.decathlon.android.textinput.VitaminTextInputLayoutFilled
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.decathlon.android.textinput.VitaminTextInputLayoutFilled>
```

or

```xml
<com.google.android.material.textfield.TextInputLayout
    style="?attr/textInputFilled"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.google.android.material.textfield.TextInputLayout>
```

### Outlined

```xml
<com.decathlon.android.textinput.VitaminTextInputLayoutOutlined
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.decathlon.android.textinput.VitaminTextInputLayoutOutlined>
```

or

```xml
<com.google.android.material.textfield.TextInputLayout
    style="?attr/textInputOutlined"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.google.android.material.textfield.TextInputLayout>
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin switch style.
You can now use the switch component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:textinputs:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="textInputStyle">@style/Widget.Vitamin.TextInputLayout</item>
        <item name="textInputFilled">@style/Widget.Vitamin.TextInputLayout.FilledBox</item>
        <item name="textInputOutlined">@style/Widget.Vitamin.TextInputLayout.OutlinedBox</item>
    </style>
</resources>
```

```xml
<!-- Filled -->
<com.decathlon.android.textinput.VitaminTextInputLayoutFilled
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.decathlon.android.textinput.VitaminTextInputLayoutFilled>
```

```xml
<com.google.android.material.textfield.TextInputLayout
    style="?attr/textInputFilled"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.google.android.material.textfield.TextInputLayout>
```

### Version 2

If you don't want to override all the text inputs components or your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:textinputs:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<com.google.android.material.textfield.TextInputLayout
    style="@style/Widget.Vitamin.TextInputLayout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.google.android.material.textfield.TextInputLayout>
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

    <com.decathlon.android.textinput.VitaminTextInputLayoutFilled
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:helperText="Helper text">
    
        <com.google.android.material.textfield.TextInputEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="hint" />
    </com.decathlon.android.textinput.VitaminTextInputLayoutFilled>

</androidx.constraintlayout.widget.ConstraintLayout>
```