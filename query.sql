-- name: GetSomeDeletedOk :many
DELETE FROM a
    USING b
WHERE a.b_id_fk = b.b_id
    RETURNING *; -- note no columns from b in model
