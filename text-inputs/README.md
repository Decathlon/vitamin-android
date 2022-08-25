# TextInput component

## TextInput design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `TextInputLayout`
component or the `VitaminTextInputLayout*` component.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml

<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

### Filled

```xml
<com.decathlon.vitamin.textinputs.VitaminTextInputLayoutFilled
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.decathlon.vitamin.textinputs.VitaminTextInputLayoutFilled>
```

or

```xml
<com.google.android.material.textfield.TextInputLayout
    style="?attr/vtmnTextInputFilledStyle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.google.android.material.textfield.TextInputLayout>
```

### Dropdown Filled

```xml
<com.decathlon.vitamin.textinputs.VitaminTextInputDropdownFilled
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.decathlon.vitamin.textinputs.VitaminDropdownEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Dropdown"
        android:inputType="none" />
</com.decathlon.vitamin.textinputs.VitaminTextInputDropdownFilled>
```

or

```xml
<com.google.android.material.textfield.TextInputLayout
    style="?attr/vtmnTextInputDropdownFilledStyle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.MaterialAutoCompleteTextView
        style="?attr/autoCompleteTextViewStyle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.google.android.material.textfield.TextInputLayout>
```

### Outlined

```xml
<com.decathlon.vitamin.textinputs.VitaminTextInputLayoutOutlined
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.decathlon.vitamin.textinputs.VitaminTextInputLayoutOutlined>
```

or

```xml
<com.google.android.material.textfield.TextInputLayout
    style="?attr/vtmnTextInputOutlinedStyle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.TextInputEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.google.android.material.textfield.TextInputLayout>
```

### Dropdown Outlined

```xml
<com.decathlon.vitamin.textinputs.VitaminTextInputDropdownOutlined
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.decathlon.vitamin.textinputs.VitaminDropdownEditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Dropdown"
        android:inputType="none" />
</com.decathlon.vitamin.textinputs.VitaminTextInputDropdownOutlined>
```

or

```xml
<com.google.android.material.textfield.TextInputLayout
    style="?attr/vtmnTextInputDropdownOutlinedStyle"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:helperText="Helper text">

    <com.google.android.material.textfield.MaterialAutoCompleteTextView
        style="?attr/autoCompleteTextViewStyle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="hint" />
</com.google.android.material.textfield.TextInputLayout>
```

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

    <com.decathlon.vitamin.textinputs.VitaminTextInputLayoutFilled
        android:layout_width="match_parent" 
        android:layout_height="wrap_content"
        app:helperText="Helper text">

        <com.google.android.material.textfield.TextInputEditText 
            android:layout_width="match_parent"
            android:layout_height="wrap_content" 
            android:hint="hint" />
    </com.decathlon.vitamin.textinputs.VitaminTextInputLayoutFilled>

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Dropdown Text Input

The Vitamin subclass of `MaterialAutoCompleteTextView`, `VitaminDropdownEditText`, declare 2
functions to help you to declare your dropdown according to the Vitamin dropdown specs.

```kotlin
fun setSimpleAdapter(items: List<String>)
```

The most simple adapter to display a list of strings. Use an `ArrayAdapter` behind.

```kotlin
fun setAdapter(items: List<Item>, @LayoutRes layout: Int = R.layout.vtmn_dropdown_item)
```

An item contains a text and optionally an icon right and/or left. These drawable should be an icon
and will be tinted with the `vtmnContentColorPrimary` Vitamin semantic color.

If you have a specific case, you can override the layout and specify your own one but you must to
specify these ids for the text and two icons: `vtmnDropdownLeftIcon`, `vtmnDropdownRightIcon`
and `vtmnDropdownText`.

Note that we don't recommend to use this function because you won't respect Vitamin specs no more.
