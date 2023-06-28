# Custom Toast

[![](https://jitpack.io/v/salikhdev/custom-toast.svg)](https://jitpack.io/#salikhdev/custom-toast)


<img src="https://github.com/salikhdev/custom-toast/assets/134202516/0ea2ff50-de1e-4928-9667-404284749bcd" width="300" height="510"/>

## Documentation

>  Available functions

CostumeToast.`doneToast( msg , activity )`    **->**  For done toast
<br />
CostumeToast.`errorToast( msg , activity )`   **->**  For error toast
<br />
CostumeToast.`warningToast( msg , activity )` **->**  For warning toast
<br />
CostumeToast.`costumeToast( msg , icon , background ,  activity )` **->**  For your costume toast

## Example

>Your costume toast

```
 CostumeToast.costumeToast(
            msg = "salikh",
            icon = R.drawable.insta_icon,
            backgroundColor = Color.parseColor("#FFF"),
            this
        )
````

## Dependencies

>1 Step. Add the code to your  `settings.gradle` file
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

>2 Step. Add the code to your  `build.gradle` file
```
	dependencies {
	        implementation 'com.github.salikhdev:custom-toast:1.0.0'
	}
```





