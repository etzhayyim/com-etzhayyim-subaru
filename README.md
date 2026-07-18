# subaru — connectivity commons constellation actor

`subaru` (昴) is the standalone Tier-B actor for an open, transparent, non-profit satellite connectivity commons. It models link budgets, coverage, orbital stewardship, and canonical Datom projections without enabling live spacecraft control.

- `src/subaru/` — production methods, social cell, and Murakumo placement
- `test/subaru/` — deterministic offline tests
- `data/` and root metadata — canonical EDN
- `wire/identity/` — externally served DID/profile JSON
- `docs/` — ADR, live-operation runbook, and WASM design notes

Run `bb test`. Live constellation operations remain Council and operator-DID gated.
