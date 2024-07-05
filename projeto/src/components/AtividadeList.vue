<template>
  <div class="atividades-list">
    <h2>Atividades</h2>
    <ul>
      <li v-for="atividade in atividades" :key="atividade.id" class="atividade-item">{{ atividade.nome }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
      atividades: []
    };
  },
  created() {
    const atividadeId = 3; 
    this.$http.get(`/atividades/${atividadeId}?fields=nome`)
      .then(response => {
        this.atividades.push(response.data); 
      })
      .catch(error => {
        console.log(error);
      });
  }
};
</script>

<style>
.atividades-list {
  font-family: Arial, sans-serif;
  width: 80%;
  margin: 0 auto;
}

.atividades-list h2 {
  font-size: 24px;
  color: #333;
}

.atividades-list ul {
  list-style-type: none;
  padding: 0;
}

.atividade-item {
  margin-bottom: 10px;
  padding: 10px;
  background-color: #f4f4f4;
  border-radius: 5px;
  border: 1px solid #ccc;
  transition: background-color 0.3s ease;
}

.atividade-item:hover {
  background-color: #e0e0e0;
}
</style>
