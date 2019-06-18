## Git 사용법

### 0. Git이란?
> 버전관리 시스템으로 **프로그램의 변경 이력을 관리해주는 소프트웨어**이다. 주로 프로그램의 변경점, 즉 버전을 **백업**하는데 이용하거나 원격 저장소를 통하여 **협업**을 하는데 이용한다.

### 1. 설치
[git 공식 홈페이지](https://git-scm.com)에 들어가서 운영체제 맞게 다운로드 받는다.

- 윈도우
  - [32-bit Git for Windows Setup](https://github.com/git-for-windows/git/releases/download/v2.22.0.windows.1/Git-2.22.0-32-bit.exe)
  - [64-bit Git for Windows Setup](https://github.com/git-for-windows/git/releases/download/v2.22.0.windows.1/Git-2.22.0-64-bit.exe)
- 맥
  - [Mac OS X](https://git-scm.com/download/mac)
- 리눅스/유닉스
  - [download for Linux and Unix](https://git-scm.com/download/linux)

### 2. Git 사용법

<hr>

#### 2-1. 저장소 만들기
##### 2-1-1. Git Repository를 처음 생성한 경우 `git init`
`git init` : 현재 디렉토리를 git으로 관리한다. (.git 디렉토리 생성) <br>
`git remote add origin URL` : 원격 저장소 등록 <br>
`git remote set-url origin URL` : 원격 저장소 주소 수정 <br>
`git remote -v` : 현재 연결되어있는 원격 저장소 확인

##### 2-1-2. Git Repository를 Clone 할 경우 `git clone`
새로운 작업환경에서 업무를 시작해야 할 경우 즉, 기존 작업환경에서 사용하던 디렉토리를 새로운 작업환경으로 가져와야 할 경우에 사용하는 방법이다.

`git clone URL` : 현재 디렉토리에 원격 저장소에 있는 디렉토리를 다운로드

##### 원격 저장소의 `public & private`
 - `public`의 경우 어떠한 권한 설정 없이도 다운로드가 가능하다.
 - 하지만, 업로드의 경우는 권한이 필요하다.
 - `private`의 경우는 다운로드도 업로드도 권한이 필요하다.

##### `git clone`으로 다운 받은 디렉토리는 `git init`, `git remote add` 과정이 필요없다.
 - 원격 저장소에서 받은 디렉토리이므로 원격 저장소 설정이 필요없다.
 - 원격 저장소 내에서 이미 버전관리가 되고 있으므로 `.git` 디렉토리 생성이 불필요하다.

#### 2-2. Git Commit을 위한 준비
git을 처음 사용할 때 해야하는 작업이 있다.

> 지금부터 만들 버전들은 `jang-jisu`가 만든 것이다. 라는 것을 다른 사람에게 알려주기 위해서 계정 정보를 입력해야한다.

##### 2-2-1. 새로운 계정 정보 입력하기
`git config --global user.name "jang-jisu"` : 이름 설정 <br>
`git config --global user.email "nosf6842@gmail.com"` : 이메일 주소 설정 <br>
`git config --global --list` : git에 저장된 계정 정보 확인 <br>
혹은 `git log` : commit 정보 확인 및 commit에 대한 계정 정보 확인가능

##### 2-2-2. 기존의 게정 정보 삭제하기
```
git credential reject
protocol=https
host=github.com
```

#### 2-3. Git Commit & Push
- *git status*
  - `git status` : 프로젝트 디렉토리의 상태를 확인한다.
- *git add*
  - `git add FILE_NAME` : 추적되지 않고있는 파일이나 변경된 파일을 **stage**에 올린다.
  - `git add .` : 현재 디렉토리의 변경사항들을 **stage**에 올린다.
  - `git add --all` : 관리되고 있는 디렉토리의 변경사항 전부를 **stage**에 올린다.
- *git commit*
  - `git commit -m "COMMIT MESSAGE"` : commit(버전 기록), `" "`안에 변경사항 즉, 버전에 대한 기록을 작성
- *git push*
  - `git push -upstream origin master` : 최초로 원격저장소에 commit을 업로드
  - `git push -u origin master` : 위와 동일(축약 명령어) **사실, 이것을 더 많이 사용한다.**
    - *이 명령어를 사용한 이후에는* `git push`만 입력해도 동작한다.
    - 이는 `git clone`을 한 경우에도 해당된다.
    - 특정 작업환경에서 최초 push인 경우, 로그인 창이 뜬다.

#### 2-4. Git Pull & Git Fetch
`git fetch` : 원격 저장소의 변경사항들을 나의 디렉토리에 가져오는 것 <br>
`git pull` : 원격 저장소의 변경사항들을 나의 디렉토리에 merge 하는 것
