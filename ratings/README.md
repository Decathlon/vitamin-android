# Rating components

## Read only mode

### Rating design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

### Rating usage specs

As this components is a Vitamin custom one, you can find here the main available options to use it :

| Option                    | Attribute                          | Related class field | Default value |
|---------------------------|------------------------------------|---------------------|---------------|
| Note value                | `app:vtmnRatingView_note`          | `note`              | `0`           |
| Comments count value      | `app:vtmnRatingView_commentsCount` | `commentsCount`     | `0`           |
| Comments count visibility | `app:vtmnRatingView_showComments`  | `showComments`      | `false`       |
| Compact mode              | `app:vtmnRatingView_compact`       | `compact`           | `false`       |
| Emphasis mode             | `app:vtmnRatingView_emphasis`      | `emphasis`          | `false`       |

### Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the `VitaminRatingView` component.

```kotlin 
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

```xml
<com.decathlon.vitamin.ratings.VitaminRatingView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

### Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.ratings.VitaminRatingView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### Customize the RatingView
You can also customize the RatingView style but keep in mind that **this is not recommended by Vitamin**

To be defined in the theme :

| Element                      | Attribute                | Default value                                                                       |
|------------------------------|--------------------------|-------------------------------------------------------------------------------------|
| RatingView style             | `vtmnRatingViewStyle`    | `@style/Widget.Vitamin.RatingView`                                                  |
| RatingView's ratingBar style | `vtmnRatingViewBarStyle` | `@style/Widget.Vitamin.RatingView.Bar`, child of `Widget.AppCompat.RatingBar.Small` |

To be defined inside the style used for `vtmnRatingViewStyle` (the default values come from `Widget.Vitamin.RatingView`) :

| Element                              | Attribute                                        | Related class field           | Default value                                    |
|--------------------------------------|--------------------------------------------------|-------------------------------|--------------------------------------------------|
| Compact icon                         | `app:vtmnRatingView_compactIcon`                 | `compactIcon`                 | `@drawable/ic_vtmn_star_fill`                    |
| Default icons color, compact or not  | `app:vtmnRatingView_defaultIconsColor`           | `defaultIconsColor`           | `?attr/vtmnContentColorPrimary`                       |
| Emphasis icons color, compact or not | `app:vtmnRatingView_emphasisIconsColor`          | `emphasisIconsColor`          | `?attr/vtmnContentColorActive`                        |
| Note text appearance                 | `app:vtmnRatingView_noteTextAppearance`          | `noteTextAppearance`          | `@style/TextAppearance.Vitamin.Ratings.Note`     |
| Comments count text appearance       | `app:vtmnRatingView_commentsCountTextAppearance` | `commentsCountTextAppearance` | `@style/TextAppearance.Vitamin.Ratings.Comments` |

## Interactive mode

### Rating design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

### Rating usage specs

This components overrides the android RatingBar and add options to it:

| Option                    | Attribute                                     | Related class field | Default value |
|---------------------------|-----------------------------------------------|---------------------|---------------|
| Emphasis mode             | `app:vtmnInteractiveRatingView_emphasis`      | `emphasis`          | `false`       |

### Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you just have to use the `VitaminInteractiveRatingView` component.

```kotlin 
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

```xml
<com.decathlon.vitamin.ratings.VitaminInteractiveRatingView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

### Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.ratings.VitaminInteractiveRatingView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### Customize the RatingView
You can also customize the InteractiveRatingView style but keep in mind that **this is not recommended by Vitamin**

To be defined in the theme :

| Element                                 | Attribute                           | Default value                                    |
|-----------------------------------------|-------------------------------------|--------------------------------------------------|
| InteractiveRatingView style             | `vtmnInteractiveRatingViewStyle`    | `@style/Widget.Vitamin.InteractiveRatingView`    |                                                 |

To be defined inside the style used for `vtmnRatingViewStyle` (the default values come from `Widget.Vitamin.RatingView`) :

| Element              | Attribute                                        | Related class field           | Default value                                    |
|----------------------|--------------------------------------------------|-------------------------------|--------------------------------------------------|
| Default icons color  | `app:vtmnInteractiveRatingView_defaultColor`     | `defaultColor`                | `?attr/vtmnContentColorPrimary`                       |
| Emphasis icons color | `app:vtmnInteractiveRatingView_emphasisColor`    | `emphasisColor`               | `?attr/vtmnContentColorActive`                        |