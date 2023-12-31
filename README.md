# 큐시즘 앱 TF Android
[![Kotlin](https://img.shields.io/badge/Kotlin-1.7.10-blue.svg)](https://kotlinlang.org)
[![Gradle](https://img.shields.io/badge/gradle-7.4-green.svg)](https://gradle.org/)
[![Android Studio](https://img.shields.io/badge/Android%20Studio-2021.3.1%20%28Dolphin%29-green)](https://developer.android.com/studio)
[![minSdkVersion](https://img.shields.io/badge/minSdkVersion-24-red)](https://developer.android.com/distribute/best-practices/develop/target-sdk)
[![targetSdkVersion](https://img.shields.io/badge/targetSdkVersion-33-orange)](https://developer.android.com/distribute/best-practices/develop/target-sdk)
<br/>

## Overview
> 큐시즘 앱 TF

- 개발 진행 기간 : 2023.08.11 ~
- 개발자 : 26,27기 안드로이드 개발자 신민서 


## Features
- 0. 전체 공지 알림 / 운영진별 공지 등록 기능 
- 1. 출석 체크
- 2. 팀 매칭 


## Development Information

### Required

- IDE : Android Studio Dolphin
- JDK : Java 8을 실행할 수 있는 JDK
- Kotlin Language : 1.7.10

### Language

- Kotlin

### Libraries

- AndroidX
  - Activity & Activity Compose & ConstraintLayout
  - Core
  - Lifecycle & ViewModel Compose
  - Navigation
  - DataStore
    
- FirebaseMessagingService
- OKHTTP3
- Retrofit2

- Lottie
- Hilt 
- Timber
 
## Foldering

```
.
├── base
├── domain                   
│   ├── entity
│   ├── repository
│   └── usecase
├── data
│   ├── local
│   └── remote
└── presentation
    ├── common
    ├── model
    ├── navigation
    └── ui

```


 
## Architecture
- Multi-Module App by separating layers (Presentation - Domain - Data)
- This Module based on MVVM Architecture
<img width="400" src="https://github.com/KOA-TF/KOA-Android/assets/100370200/509eedf4-22a7-49ec-a2d5-ebe28067f2de">
