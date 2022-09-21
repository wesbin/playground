<script setup>
import {useRoute} from 'vue-router';
import FloatTopButton from '@/components/common/FloatTopButton';

const route = useRoute();
</script>

<template>
  <div style="height: 20000px">
    {{ route.params.title }}
  </div>
  <FloatTopButton></FloatTopButton>
</template>

<style lang="scss" scoped>

</style>