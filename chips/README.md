# Chips component

## Chip design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the default `Chip` component with vitamin styles or directly the different vitamin chip components.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
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
        style="?attr/vtmnChipFilterMediumStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Filter medium" />

    <com.google.android.material.chip.Chip
        style="?attr/vtmnChipFilterSmallStyle"
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
        style="?attr/vtmnChipInputMediumStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Input medium" />

    <com.google.android.material.chip.Chip
        style="?attr/vtmnChipInputSmallStyle"
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
        style="?attr/vtmnChipInputImageMediumStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/profile_picture"
        android:text="Input medium with image" />

    <com.google.android.material.chip.Chip
        style="?attr/vtmnChipInputImageSmallStyle"
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
        style="?attr/vtmnChipSingleChoiceMediumStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Single choice medium" />

    <com.google.android.material.chip.Chip
        style="?attr/vtmnChipSingleChoiceSmallStyle"
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
        app:chipIcon="@drawable/ic_vtmn_heart_fill"
        android:text="Action medium" />

    <com.decathlon.vitamin.chips.VitaminActionSmallChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/ic_vtmn_heart_fill"
        android:text="ACtion small" />

</com.google.android.material.chip.ChipGroup>
```

or

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <com.google.android.material.chip.Chip
        style="?attr/vtmnChipActionMediumStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/ic_vtmn_heart_fill"
        android:text="Action medium" />

    <com.google.android.material.chip.Chip
        style="?attr/vtmnChipActionSmallStyle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:chipIcon="@drawable/ic_vtmn_heart_fill"
        android:text="Action small" />

</com.google.android.material.chip.ChipGroup>
```

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<com.google.android.material.chip.ChipGroup
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.chips.VitaminFilterMediumChip
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Filter medium" />

</com.google.android.material.chip.ChipGroup>
```