**Before git how projects/ code is managed ?**



-> manual file copying to sophisticated(complex) CVCS(centralized version control system)

->problems : single point of failure, offline limitation, difficult branching, limited transparency, performance issues(slow).



-> git solved this, as now :

-> we can go back to any version, compare changes, track who changed code

-> collaboration : developer work independently, merge safely, review via pull requests.

-> every developer has its own copy offline too, reliability backup if central repo fails then it is restored from any developers local repository(offline repo), local operations are fast

-> efficient branching \& merging (easy to create), detailed history \& integrity, collaboration (user friendly interface).





**What is git ? (INTER)**



-> Git is a distributed version control system designed to track changes in source code during software development.





**what is distributed system ?**



-> A distributed system is a collection of independent, networked computers that communicate and coordinate via message passing to appear as a single, coherent unit to the user.



**what things do git track ?**



-> file content, author, timestamp, commit message, line-level changes.

-> track using commands : -> **git blame, git diff, git log**





**GIT ARCHITECTURE** 



Working Directory ("folder in which project is there.")

&nbsp;       ↓

Staging Area (Index) ("phase after tracking but before commiting.") 

&nbsp;       ↓

Local Repository (.git) (".git/ it contains all data like commit, branches, tags, metadata")

&nbsp;       ↓

Remote Repository("the repo stored on cloud `github, gitlab` ")







1. **Working Directory**



👉 Your actual project folder.



State:



Untracked



Modified



commands to check : **git status** 



2\. **Staging area**



👉 Intermediate buffer before commit.





You choose what to commit.



git add file.java

git add .



Now changes are “Staged”.



Why important?



✔ Selective commits

✔ Clean history

✔ Partial file commits





3\. **Local Repository(".git/ ")**



Contains:



Commits



Branches



Tags



Metadata



SHA hashes



When you run:



git commit -m "message"



Data moves from:



Staging Area → Local Repo



Commit is permanent snapshot.





4\. **Remote Repository**



Stored on:



GitHub



GitLab



Bitbucket



Push:



git push origin main



Pull:



git pull origin main





**INTER - QUESTIONS**



**What is the difference between staging area and local repository?**



-> staging area is temporary selection space whereas local repository contains permanent snapshots also commit happens only after 'staging area'.





**Why is Git distributed?**



-> every developer has own copy, collaborate independently to central repo, faster branching and merging, offline commits.




**-------Repository Setup :-------**



-> **git init :starting a new project from scratch.**



What happens internally?



Project Folder

&nbsp;  ↓

.git/ (hidden folder created)

&nbsp;  ├── objects/

&nbsp;  ├── refs/

&nbsp;  ├── HEAD

&nbsp;  └── config



Now Git can:



Track changes



Create commits



Manage branches



📌 Use case:

When starting a new project from scratch.





**-> git clone : copies an existing remote repo with complete history.**



👉 Copies an existing remote repository.



git clone <repository-url>



Example platforms:



GitHub



GitLab



Bitbucket



What clone does:

Remote Repo

&nbsp;    ↓

Full copy (history + branches + commits)

&nbsp;    ↓

Local Repo + Working Directory





**-> git config : sets identity and behaviour** 



git config --global user.name "Lakshay"

git config --global user.email "lakshay@email.com"



Levels:



System Level

Global Level

Local Level (.git/config)



Interview point:

Git needs username/email because each commit stores author metadata.







**-------Tracking Changes-------**



**Full Tracking Flow**



**Modify File**

    **↓**

**git status**

    **↓**

**git add**

    **↓**

**git commit**

    **↓**

**git log**





**-> git status : shows current state used before committing.**



**shows :**

* Untracked files
* Modified files
* Staged files



-> **git add . : adds the file/directory changes to staging area** 



git add file.java

git add .



Visual:



Working Directory

&nbsp;     ↓ (git add)

Staging Area



Why important?



✔ Selective commits

✔ Clean commit history

✔ Partial staging possible





**-> git commit : creates snapshot** 



git commit -m "Added login validation"



Visual:



Staging Area

&nbsp;     ↓ (git commit)

Local Repository



Each commit contains:



Unique SHA



Author



Date



Commit message



Snapshot of files





**-> git log : Shows commit history.**





git log



Visual:



commit a1b2c3

Author: Lakshay

Message: Added login



commit d4e5f6

Message: Initial commit



Useful flags:



git log --oneline

git log --graph





**-> git diff : Shows differences between:**



**Working vs Staging**



**Staging vs Commit**



**Commit vs Commit**





**primary purpose : debugging**





🌿 5️⃣ Branching (Most Important Git Concept)



This is where Git becomes powerful.



🔹 5.1 What is a Branch?



A branch is:



👉 A pointer to a commit.



Visual:



A --- B --- C  (main)



If you create branch:



git branch feature-login



Now:



A --- B --- C  (main)

&nbsp;             \\

&nbsp;              C  (feature-login)



Both point to same commit initially.



🔹 5.2 **-> git branch : creates branch**



Create branch:



git branch feature-payment



List branches:



git branch



Delete branch:



git branch -d feature-payment

🔹 5.3 **git checkout / git switch : switches branch**



Switch branch:



git checkout feature-login



or modern:



git switch feature-login



Visual:



HEAD → feature-login

🔹 5.4 HEAD Pointer (CRUCIAL)



HEAD is:



👉 Pointer to current branch.



HEAD → main



If you switch:



git switch feature-login



Now:



HEAD → feature-login



Interview Question:



What is HEAD in Git?



Answer:

**HEAD is a reference pointer to the current branch or commit.**



**🔹 5.5 Feature Branch Model**



**Professional workflow:**



**main**

 **├── feature-login**

 **├── feature-payment**

 **└── hotfix-issue**



**Process:**



**Create feature branch**



**Work independently**



**Merge into main**



**Delete feature branch**



**This prevents breaking production.**







🔹 5.6 **Main vs Develop Branch**



Two common setups:



**Simple Model**

* **main → Production branch**



**Git Flow Model**

* **main → Production**
* **develop → Integration branch**
* **feature/\* → Features**
* **hotfix/\* → Urgent fixes**



**Used heavily in enterprise systems.**





🔹 5.6 Main vs Develop Branch



Two common setups:



Simple Model

main → Production branch

Git Flow Model

main → Production

develop → Integration branch

feature/\* → Features

hotfix/\* → Urgent fixes



Used heavily in enterprise systems.







**\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_MERGING\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_**



**Merging = Combining Branches**



if main doesn't changes after branching no merge commits, only pointer moves forward, this is "**FAST FORWARD MERGE**"



Both the branches are changed now, new merge commit created + combines both branches, this is "**3-WAY MERGE**"



**-> git merge : finds common ancestor, compares changes, merge automatically if possible**



**Conflict Resolution :**



Why conflicts occur ?

-> same file, same lines, different changes



**example**

**-----------------------**

**<<<<<<< HEAD**

**return true;**

**=======**

**return false;**

**>>>>>>> feature-login**

**-----------------------**



**Steps to resolve :**



**Edit file manually**



**Remove conflict markers**



**Stage file**





**Why conflicts occur ?**

-> When same part of file modified differently in two branches.





**\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_REMOTE\_COLLABORATION\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_**



**git remote : shows connected remotes**



**git remote add origin <url> : add remote**



**git push : uploads commits to resolve (flow : Local Repo -> Remote Repo)**



**git pull : git fetch + git merge (downloads + merges)**



**git fetch : only downloads changes do not merge (safe to check chnages first)**



**\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_PULL\_REQUESTS\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_**



**Feature Branch**

     **↓**

**Push to Remote**

     **↓**

**Create PR**

     **↓**

**Code Review**

     **↓**

**Approve**

     **↓**

**Merge**





**PR ensures:**



**✔ Code quality**

**✔ Peer review**

**✔ CI checks**





**\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_UNDOING\_CHANGES\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_**



**git restore : changes from working directory to last commit state (Working Directory → Last Commit State)**

removes all the uncommited changes -> "staged changes" 


**git reset : moves HEAD pointer (HEAD moves backward)**



* **SOFT RESET (git reset --soft HEAD~1)  undo commit, keep changes stagged**
* **MIXED RESET (git reset HEAD~1) undo commit, unstage changes**
* **HARD RESET (git reset --hard HEAD~1) deletes commit, deleted changes**







**git revert <commit-id> : creates new commit that undoes the previous commit (safer alternate to reset).**

**-safe for shared branch** 

**-does not rewire history**



**git commit --amend -m "Correct message" : fix commit messages** 



**\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_TAGGING\_AND\_RELEASES\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_**



**git tag : used for marking versions**



Lightweight Tags : (**git tag v1.0**) : just pointer to commit 

Annotated tags : (**git tag -a v1.0 -m "Production release"**) : stores tagger, date, message

Push tags : (**git push origin --tags**) : production deployment, CI/CD pipelines



**\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_BEST\_PRACTICES\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_**



**Meaningful messages :: use : feat, fix, refactor, test, docs**

**.gitignore : prevents committing** 



**\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_CLEAN\_HISTORY\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_**



**Rebase : git rebase main : rewires history, makes linear commits**



**Before :** 

**A --- B --- C**

       **\\**

        **D --- E**





**After :**

**A --- B --- C --- D' --- E'**



**Note : Never rebase shared public branches.**









**Create feature branch**

      **↓**

**Code**

      **↓**

**git add**

**git commit**

      **↓**

**git push**

      **↓**

**Create Pull Request**

      **↓**

**Review**

      **↓**

**Merge**

      **↓**

**Tag Release**

      **↓**

**Deploy**


git cherrypick - picks one or more commit from a branch and merges them into another 






