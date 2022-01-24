# Chips component

## Chip design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `Chip` component with vitamin styles or directly the different vitamin chip components.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

### Filter

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.decathlon.vitamin.chips.VitaminFilterMediumChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Filter medium" />

    <com.decathlon.vitamin.chips.VitaminFilterSmallChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Filter small" />

</com.google.android.material.chip.ChipGroup>
```

or

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.google.android.material.chip.Chip
        style="?attr/chipFilterMedium"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Filter medium" />

    <com.google.android.material.chip.Chip
        style="?attr/chipFilterSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Filter small" />

</com.google.android.material.chip.ChipGroup>
```

### Input

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.decathlon.vitamin.chips.VitaminInputMediumChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Input medium" />

    <com.decathlon.vitamin.chips.VitaminInputSmallChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Input small" />

</com.google.android.material.chip.ChipGroup>
```

or

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.google.android.material.chip.Chip
        style="?attr/chipInputMedium"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Input medium" />

    <com.google.android.material.chip.Chip
        style="?attr/chipInputSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Input small" />

</com.google.android.material.chip.ChipGroup>
```

You can also use icons:

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.decathlon.vitamin.chips.VitaminInputMediumChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/ic_vtmn_map_pin_line"
        android:text="Input medium with icon" />

</com.google.android.material.chip.ChipGroup>
```

If you want to use image (like profile picture), you have a specific type for that (to avoid blue tint). You have to round the image by yourself.

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.decathlon.vitamin.chips.VitaminInputImageMediumChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/profile_picture"
        android:text="Input medium with image" />

    <com.decathlon.vitamin.chips.VitaminInputImageSmallChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/profile_picture"
        android:text="Input small with image" />

</com.google.android.material.chip.ChipGroup>
```

or

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.google.android.material.chip.Chip
        style="?attr/chipInputImageMedium"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/profile_picture"
        android:text="Input medium with image" />

    <com.google.android.material.chip.Chip
        style="?attr/chipInputImageSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/profile_picture"
        android:text="Input small with image" />

</com.google.android.material.chip.ChipGroup>
```

Example with Glide : 

```kotlin
Glide.with(this)
    .load("https://bit.ly/3KviOlB")
    .circleCrop()
    .into(object: CustomTarget<Drawable>() { 
        override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) { 
            inputChip.chipIcon = resource 
        }

        override fun onLoadCleared(placeholder: Drawable?) {
            inputChip.chipIcon = placeholder
        }
    })
```

### Single Choice

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:singleSelection="true">

    <com.decathlon.vitamin.chips.VitaminSingleChoiceMediumChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Single choice medium" />

    <com.decathlon.vitamin.chips.VitaminSingleChoiceSmallChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Single choice small" />

</com.google.android.material.chip.ChipGroup>
```

or

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:singleSelection="true">

    <com.google.android.material.chip.Chip
        style="?attr/chipSingleChoiceMedium"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Single choice medium" />

    <com.google.android.material.chip.Chip
        style="?attr/chipSingleChoiceSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Single choice small" />

</com.google.android.material.chip.ChipGroup>
```
### Action

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.decathlon.vitamin.chips.VitaminActionMediumChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/ic_vtmn_heart_3_fill"
        android:text="Action medium" />

    <com.decathlon.vitamin.chips.VitaminActionSmallChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/ic_vtmn_heart_3_fill"
        android:text="ACtion small" />

</com.google.android.material.chip.ChipGroup>
```

or

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.google.android.material.chip.Chip
        style="?attr/chipActionMedium"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/ic_vtmn_heart_3_fill"
        android:text="Action medium" />

    <com.google.android.material.chip.Chip
        style="?attr/chipActionSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/ic_vtmn_heart_3_fill"
        android:text="Action small" />

</com.google.android.material.chip.ChipGroup>
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin chips styles.
You can now use the chip component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:chips:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <item name="chipSingleChoiceMedium">@style/Widget.Vitamin.Chip.SingleChoice.Medium</item>
        <item name="chipSingleChoiceSmall">@style/Widget.Vitamin.Chip.SingleChoice.Small</item>
        <item name="chipFilterMedium">@style/Widget.Vitamin.Chip.Filter.Medium</item>
        <item name="chipFilterSmall">@style/Widget.Vitamin.Chip.Filter.Small</item>
        <item name="chipActionMedium">@style/Widget.Vitamin.Chip.Action.Medium</item>
        <item name="chipActionSmall">@style/Widget.Vitamin.Chip.Action.Small</item>
        <item name="chipInputMedium">@style/Widget.Vitamin.Chip.Input.Medium</item>
        <item name="chipInputSmall">@style/Widget.Vitamin.Chip.Input.Small</item>
        <item name="chipInputImageMedium">@style/Widget.Vitamin.Chip.InputImage.Medium</item>
        <item name="chipInputImageSmall">@style/Widget.Vitamin.Chip.InputImage.Small</item>
        <item name="chipStyle">@style/Widget.Vitamin.Chip.Action.Medium</item>
        <item name="chipStandaloneStyle">@style/Widget.Vitamin.Chip.Input.Medium</item>
    </style>
</resources>
```

### Version 2

If you don't want to override all the chip components of your app, you can inherit the Base Vitamin theme but only style the components you want.

```kotlin
implementation("com.decathlon.vitamin:chips:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
    </style>
</resources>
```

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.google.android.material.chip.Chip
        style="@style/Widget.Vitamin.Chip.Filter.Medium"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Filter medium" />

</com.google.android.material.chip.ChipGroup>
```

### Version 3

If you don't want to use Vitamin colors and font on all your app, you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin">

    <com.decathlon.vitamin.chips.VitaminFilterMediumChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Filter medium" />

</com.google.android.material.chip.ChipGroup>
```