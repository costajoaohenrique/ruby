json.extract! customer, :id, :nome, :email, :birthday, :obs, :created_at, :updated_at
json.url customer_url(customer, format: :json)