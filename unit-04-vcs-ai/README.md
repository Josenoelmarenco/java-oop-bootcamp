# Unit 4 — VCS profesional + AI como revisor

**Objetivo:** elevar tu uso de git de "sé hacer push" a "uso git como ingeniero". Y aprender a usar la AI como **revisor crítico de tu código**, no como generador.

**Lo que NO está en esta unidad** (porque ya lo dominas): inicializar un repo, hacer un push, generar una clase con Copilot. Esto es trabajo real, no obviedades.

**Referencia:** módulo 4 del [repo de Vesa](https://github.com/vesavvo/Object-Oriented-Programming) (4_VCS_and_AI-assisted_coding.md), complementado.

## Ejercicios (acciones operativas, no archivos .java)

- [ ] **01 AuditoriaCommits** — ejecuta `git log --oneline --graph` sobre el repo del bootcamp. Revisa tus últimos 10 commits y anota en `_AUDIT.md` 3 mejoras concretas (mensajes vagos, commits demasiado grandes, mezclas de scope).

- [ ] **02 ConventionalCommits** — adopta el estándar Conventional Commits (`feat:`, `fix:`, `refactor:`, `docs:`, `test:`, `chore:`). Aplícalo en tus próximos 10 commits del bootcamp. Sin trampas: revisa cada uno antes de pushear.

- [ ] **03 BranchAndRebase** — para 3 ejercicios distintos: crea branch `feature/uX-NN-nombre`, commits atómicos, vuelve a main con **rebase** (no merge commit). Anota la diferencia entre rebase y merge en `_BRANCHING_NOTES.md`.

- [ ] **04 GitBisect** — rompe a propósito un ejercicio ya hecho (ej. invierte una condición en un test que pasaba). Haz 5-10 commits encima. Luego usa `git bisect` para encontrar el commit malo. Documenta el flujo en `_BISECT_NOTES.md`.

- [ ] **05 AIReview** — toma 3 ejercicios ya cerrados (uno de Unit 1, uno de Unit 2, uno de Unit 3). Pega cada uno en un LLM con este prompt: *"Actúa como senior Java reviewer. NO me des código mejorado. Dame 5 críticas accionables: naming, edge cases, idiomatismo Java, robustez, claridad."* Documenta las críticas y qué aplicaste en `_REVIEW_NOTES.md`.

## Daily log

-
-

## Para cerrar la unidad

- [ ] Los 5 ejercicios completos y documentos `_AUDIT.md`, `_BRANCHING_NOTES.md`, `_BISECT_NOTES.md`, `_REVIEW_NOTES.md` creados.
- [ ] `.gitignore` profesional en la raíz del repo (Java + IntelliJ + Mac).
