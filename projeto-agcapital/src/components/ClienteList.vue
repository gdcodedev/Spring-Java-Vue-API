<template>
  <div class="clientes-list">
    <h2>Clientes</h2>
    <ul>
      <li v-for="cliente in clientes" :key="cliente.id" class="cliente-item">{{ cliente.nome }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      clientes: []
    };
  },
  created() {
    this.$http.get('/clientes')
      .then(response => {
        this.clientes = response.data;
      })
      .catch(error => {
        console.log(error);
      });
  }
};
</script>

<style>
.clientes-list {
  font-family: Arial, sans-serif;
  width: 80%;
  margin: 0 auto;
}

.clientes-list h2 {
  font-size: 24px;
  color: #333;
}

.clientes-list ul {
  list-style-type: none;
  padding: 0;
}

.cliente-item {
  margin-bottom: 10px;
  padding: 10px;
  background-color: #f4f4f4;
  border-radius: 5px;
  border: 1px solid #ccc;
  transition: background-color 0.3s ease;
}

.cliente-item:hover {
  background-color: #e0e0e0;
}
</style>
