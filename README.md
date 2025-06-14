# eventbus3-intellij-plugin

Plugin to navigate between events posted by [EventBus](https://github.com/greenrobot/EventBus).

[中文说明](./README-zh.md)

## Change Log

### 2018-10-17

- update icon

### 2018-08-13

- Fix bug
- Support `postSticky` to `@Subscribe`
- Try support kotlin

### 2018-08-10

code change in branch `dev` , try support kotlin

- Support `postSticky` to `@Subscribe`


### 2016-09-07
- add build version
- modify `plugin id` , so that I can upload new version in https://plugins.jetbrains.com/
- fix `plugin.xml` to enable to install in Android Studio'Plugins Online

### 2016-09-05
Originator did not reply our's issue,I try to let it work

- Fix for EventBus3 new package name
- Fix a class that don't exist in the last `intellij plugin SDK`
- Add some `try-catch` , So it don't shutdown

----



### `post | postSticky` to `@Subscribe` and `@Subscribe` to `post`

![](https://raw.githubusercontent.com/kgmyshin/eventbus3-intellij-plugin/master/art/cap.gif)


## Download & Install

There are two ways.

- Preference -> Plugins -> Browse `EventBus` -> Select `EventBus3 Intellij Plugin` -> push Install plugin Btn.

- [Download](https://github.com/likfe/eventbus3-intellij-plugin/raw/master/eventbus3-intellij-plugin.jar) the plugin jar and select "Install Plugin From Disk" in IntelliJ's plugin preferences.

## Issues

- [Unsupported major.minor version 52.0](https://github.com/likfe/eventbus3-intellij-plugin/issues/1)


## License 

```
Copyright 2016

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
