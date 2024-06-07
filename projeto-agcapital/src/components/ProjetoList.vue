<template>
  <div class="projetos-list">
    <h2>Projetos</h2>
    <ul>
      <li v-for="projeto in projetos" :key="projeto.id" class="projeto-item">
        {{ projeto.nome }} - {{ projeto.status }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  props: ['clienteId'],
  data() {
    return {
      projetos: []
    };
  },
  created() {
    this.$http.get(`/projetos/cliente/${this.clienteId}`)
      .then(response => {
        this.projetos = response.data;
      })
      .catch(error => {
        console.log(error);
      });
  }
};
</script>

<style>
.projetos-list {
  font-family: Arial, sans-serif;
  width: 80%;
  margin: 0 auto;
}

.projetos-list h2 {
  font-size: 24px;
  color: #333;
}

.projetos-list ul {
  list-style-type: none;
  padding: 0;
}

.projeto-item {
  margin-bottom: 10px;
  padding: 10px;
  background-color: #f4f4f4;
  border-radius: 5px;
  border: 1px solid #ccc;
  transition: background-color 0.3s ease;
}

.projeto-item:hover {
  background-color: #e0e0e0;
}
</style>
