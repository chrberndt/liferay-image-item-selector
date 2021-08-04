# liferay-image-item-selector
Explore and demonstrate how to use Liferay's InfoItemSelectorView interface

## Workspace Settings

`gradle.properties`

```
liferay.workspace.product = dxp-7.3-sp1
```

`settings.gradle`

```
buildscript {
	dependencies {
		classpath group: "biz.aQute.bnd", name: "biz.aQute.bnd", version: "5.2.0"
		classpath(group: "com.liferay", name: "com.liferay.gradle.plugins.workspace", version: "3.4.12") {
			exclude group: "biz.aQute.bnd", module: "biz.aQute.bnd"
		}
		classpath group: "net.saliman", name: "gradle-properties-plugin", version: "1.4.6"
	}

	repositories {
		maven {
			url "https://repository-cdn.liferay.com/nexus/content/groups/public"
		}

		maven {
			url "https://repository.liferay.com/nexus/content/groups/public"
		}
	}
}

apply plugin: "net.saliman.properties"

apply plugin: "com.liferay.workspace"
```

## Contact

christian.berndt@liferay.com