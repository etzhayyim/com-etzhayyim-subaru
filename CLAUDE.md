# subaru repository rules

- EDN is canonical for metadata, schemas, data, and ADRs.
- External JSON, JSON-LD, and BPMN belongs under `wire/` only.
- Production code belongs under `src/subaru`; tests belong under `test/subaru`.
- Do not restore monorepo-relative paths, Go/TinyGo ports, shell runners, generated WASM, or JSON-LD metadata.
- Preserve connectivity-commons, no-surveillance, no-subscription, orbital-stewardship, spectrum-honesty, and operator gates.
- Run `bb test`, parse all EDN, and audit artifacts before publishing.
