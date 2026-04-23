# HelloApp

This repository is used for testing Git and GitHub workflows.

---

## Purpose

- Practice core Git workflows (init, add, commit, push, pull)
- Configure and validate SSH authentication with GitHub
- Understand version control concepts and commit history tracking
- Experiment with basic project structure and repository management

---

## Contents

This repository contains some sample files, including:

- Java practice files
- A simple HTML file (Rock Paper Scissors)

These files are used for testing purposes only.

---

## Git Commands Used

```bash
git init
git add .
git commit -m "test: initial commit"
git branch -M main
git remote add origin git@github.com:Kuan002/HelloApp.git
git push -u origin main
```

## Project Structure

Files are organized into separate directories based on type:

```bash
HelloApp/
├── java/    # Contains all Java source files
├── web/     # Contains HTML files
├── README.md
All .java files are placed in the java/ directory
All .html files are placed in the web/ directory
```

This structure improves organization and makes the project easier to navigate.

## 🌐 View HTML on Website (GitHub Pages)

The HTML file can be accessed as a live website using GitHub Pages.

### Setup

1. Go to repository **Settings → Pages**
2. Under **Source**, select:

```bash
Deploy from a branch
Branch: main
Folder: / (root)
```

## Notes
- Repository is for learning and testing only
- Not intended as a production or portfolio project
- Commit history reflects Git practice workflow
